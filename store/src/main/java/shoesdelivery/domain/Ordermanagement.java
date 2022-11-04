package shoesdelivery.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import shoesdelivery.StoreApplication;
import shoesdelivery.domain.ShippingStarted;
import shoesdelivery.domain.배달시작됨;
import shoesdelivery.domain.쿠폰발행됨;

@Entity
@Table(name = "Ordermanagement_table")
@Data
public class Ordermanagement {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @PostPersist
    public void onPostPersist() {
        배달시작됨 배달시작됨 = new 배달시작됨(this);
        배달시작됨.publishAfterCommit();
    }

    @PrePersist
    public void onPrePersist() {
        쿠폰발행됨 쿠폰발행됨 = new 쿠폰발행됨(this);
        쿠폰발행됨.publishAfterCommit();
    }

    @PreUpdate
    public void onPreUpdate() {
        ShippingStarted shippingStarted = new ShippingStarted(this);
        shippingStarted.publishAfterCommit();
    }

    public static OrdermanagementRepository repository() {
        OrdermanagementRepository ordermanagementRepository = StoreApplication.applicationContext.getBean(
            OrdermanagementRepository.class
        );
        return ordermanagementRepository;
    }

    public static void receiveOrderinformation(
        PaymentApproved paymentApproved
    ) {
        /** Example 1:  new item 
        Ordermanagement ordermanagement = new Ordermanagement();
        repository().save(ordermanagement);

        */

        /** Example 2:  finding and process
        
        repository().findById(paymentApproved.get???()).ifPresent(ordermanagement->{
            
            ordermanagement // do something
            repository().save(ordermanagement);


         });
        */

    }

    public static void cancelOrder(PaymentCancelled paymentCancelled) {
        /** Example 1:  new item 
        Ordermanagement ordermanagement = new Ordermanagement();
        repository().save(ordermanagement);

        */

        /** Example 2:  finding and process
        
        repository().findById(paymentCancelled.get???()).ifPresent(ordermanagement->{
            
            ordermanagement // do something
            repository().save(ordermanagement);


         });
        */

    }
}
