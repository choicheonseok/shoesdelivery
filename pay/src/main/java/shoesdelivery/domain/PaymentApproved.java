package shoesdelivery.domain;

import java.util.*;
import lombok.*;
import shoesdelivery.domain.*;
import shoesdelivery.infra.AbstractEvent;

@Data
@ToString
public class PaymentApproved extends AbstractEvent {

    private Long id;
    private String orderId;
    private Double price;
    private String kakaopayId;
    private String createDate;

    public PaymentApproved(PaymentHistory aggregate) {
        super(aggregate);
    }

    public PaymentApproved() {
        super();
    }
}
