package shoesdelivery.domain;

import java.util.*;
import lombok.*;
import shoesdelivery.domain.*;
import shoesdelivery.infra.AbstractEvent;

@Data
@ToString
public class ShippingStarted extends AbstractEvent {

    private Long id;
    private String productName;
    private String deliveryAddress;
    private String orderId;
    private Long phoneNumber;
    private Date deliveryDate;
}
