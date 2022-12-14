package shoesdelivery.domain;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import shoesdelivery.domain.*;

@RepositoryRestResource(
    collectionResourceRel = "ordermanagements",
    path = "ordermanagements"
)
public interface OrdermanagementRepository
    extends PagingAndSortingRepository<Ordermanagement, Long> {}
