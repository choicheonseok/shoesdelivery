from sqlalchemy.ext.declarative import declarative_base 
from sqlalchemy import Column, String, Integer, event, Float, Boolean
from datetime import datetime

import util
from 주문됨 import 주문됨
from external.결제이력 import 결제이력
from external.결제이력Service import 결제
from 주문취소됨 import 주문취소됨
from Ordered import Ordered
from external.PaymentHistory import PaymentHistory
from external.PaymentHistoryService import Pay
from OrderCancelled import OrderCancelled

Base = declarative_base()

class Order(Base):
    __tablename__ = 'Order_table'
    id = Column(Integer, primary_key=True)
    item = Column(String(50))
    colorCode = Column(String(50))
    size = Column(String(50))
    quantity = Column(Integer)

    def __init__(self):
        self.id = None
        self.item = None
        self.colorCode = None
        self.size = None
        self.quantity = None

@event.listens_for(Order, 'after_insert')
def PostPersist(mapper, connection, target):
    event = 주문됨()
    event = util.AutoBinding(target, event)

    event.Publish()
    
    결제이력 = 결제이력()
    response = 결제(결제이력)

    print(response)
    event = Ordered()
    event = util.AutoBinding(target, event)

    event.Publish()
    
    paymentHistory = PaymentHistory()
    response = Pay(paymentHistory)

    print(response)

    
@event.listens_for(Order, 'before_insert')
def PrePersist(mapper, connection, target):
    event = 주문취소됨()
    event = util.AutoBinding(target, event)

    event.Publish()
    

    
@event.listens_for(Order, 'before_delete')
def PreRemove(mapper, connection, target):
    event = OrderCancelled()
    event = util.AutoBinding(target, event)

    event.Publish()
    

    

