package shoesdelivery.infra;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import shoesdelivery.domain.*;

@Component
public class PaymentHistoryHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<PaymentHistory>> {

    @Override
    public EntityModel<PaymentHistory> process(
        EntityModel<PaymentHistory> model
    ) {
        return model;
    }
}
