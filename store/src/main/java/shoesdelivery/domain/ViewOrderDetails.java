package shoesdelivery.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "ViewOrderDetails_table")
@Data
public class ViewOrderDetails {

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
}
