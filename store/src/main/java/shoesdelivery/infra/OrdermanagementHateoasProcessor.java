package shoesdelivery.infra;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import shoesdelivery.domain.*;

@Component
public class OrdermanagementHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Ordermanagement>> {

    @Override
    public EntityModel<Ordermanagement> process(
        EntityModel<Ordermanagement> model
    ) {
        return model;
    }
}
