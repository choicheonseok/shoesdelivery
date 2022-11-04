package shoesdelivery.infra;

import java.util.List;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import shoesdelivery.domain.*;

@RepositoryRestResource(
    collectionResourceRel = "viewOrderDetails",
    path = "viewOrderDetails"
)
public interface ViewOrderDetailsRepository
    extends PagingAndSortingRepository<ViewOrderDetails, Long> {}
