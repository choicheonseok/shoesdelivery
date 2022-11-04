package shoesdelivery.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import shoesdelivery.PayApplication;
import shoesdelivery.domain.PaymentApproved;
import shoesdelivery.domain.PaymentCancelled;
import shoesdelivery.domain.결제승인됨;

@Entity
@Table(name = "PaymentHistory_table")
@Data
public class PaymentHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String orderId;

    private Double amount;

    @PrePersist
    public void onPrePersist() {
        결제승인됨 결제승인됨 = new 결제승인됨(this);
        결제승인됨.publishAfterCommit();

        PaymentApproved paymentApproved = new PaymentApproved(this);
        paymentApproved.publishAfterCommit();

        PaymentCancelled paymentCancelled = new PaymentCancelled(this);
        paymentCancelled.publishAfterCommit();
    }

    public static PaymentHistoryRepository repository() {
        PaymentHistoryRepository paymentHistoryRepository = PayApplication.applicationContext.getBean(
            PaymentHistoryRepository.class
        );
        return paymentHistoryRepository;
    }

    public static void cancelApproval(OrderCancelled orderCancelled) {
        /** Example 1:  new item 
        PaymentHistory paymentHistory = new PaymentHistory();
        repository().save(paymentHistory);

        */

        /** Example 2:  finding and process
        
        repository().findById(orderCancelled.get???()).ifPresent(paymentHistory->{
            
            paymentHistory // do something
            repository().save(paymentHistory);


         });
        */

    }
}
