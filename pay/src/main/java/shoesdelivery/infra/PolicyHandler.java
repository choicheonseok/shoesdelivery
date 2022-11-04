package shoesdelivery.infra;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import javax.naming.NameParser;
import javax.naming.NameParser;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;
import shoesdelivery.config.kafka.KafkaProcessor;
import shoesdelivery.domain.*;

@Service
@Transactional
public class PolicyHandler {

    @Autowired
    결제이력Repository 결제이력Repository;

    @Autowired
    PaymentHistoryRepository paymentHistoryRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='주문취소됨'"
    )
    public void whenever주문취소됨_결재취소함(@Payload 주문취소됨 주문취소됨) {
        주문취소됨 event = 주문취소됨;
        System.out.println(
            "\n\n##### listener 결재취소함 : " + 주문취소됨 + "\n\n"
        );
        // Sample Logic //

    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='OrderCancelled'"
    )
    public void wheneverOrderCancelled_CancelApproval(
        @Payload OrderCancelled orderCancelled
    ) {
        OrderCancelled event = orderCancelled;
        System.out.println(
            "\n\n##### listener CancelApproval : " + orderCancelled + "\n\n"
        );

        // Comments //
        //결재취소함

        // Sample Logic //
        PaymentHistory.cancelApproval(event);
    }
}
