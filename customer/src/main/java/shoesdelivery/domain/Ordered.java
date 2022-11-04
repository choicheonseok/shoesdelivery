package shoesdelivery.domain;

import java.util.*;
import lombok.*;
import shoesdelivery.domain.*;
import shoesdelivery.infra.AbstractEvent;

@Data
@ToString
public class Ordered extends AbstractEvent {

    private Long id;
    private String item;
    private String colorCode;
    private String size;
    private Integer quantity;
}
