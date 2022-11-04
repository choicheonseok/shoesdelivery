package shoesdelivery.domain;

import java.util.*;
import lombok.*;
import shoesdelivery.domain.*;
import shoesdelivery.infra.AbstractEvent;

@Data
@ToString
public class OrderCancelled extends AbstractEvent {

    private Long id;
    private Long orderId;
    private String status;
}
