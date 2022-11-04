package shoesdelivery.domain;

import java.util.*;
import lombok.*;
import shoesdelivery.domain.*;
import shoesdelivery.infra.AbstractEvent;

@Data
@ToString
public class PaymentCancelled extends AbstractEvent {

    private Long id;
    private String orderId;
    private Long price;
    private String kakopayId;
    private String createDate;

    public PaymentCancelled(PaymentHistory aggregate) {
        super(aggregate);
    }

    public PaymentCancelled() {
        super();
    }
}
