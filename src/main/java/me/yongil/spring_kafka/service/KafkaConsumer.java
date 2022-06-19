package me.yongil.spring_kafka.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

/**
 * @author yongil.kwon@linecorp.com
 */
@Component
public class KafkaConsumer {

    @KafkaListener(
            id = "yong",
            topics = "test",
            clientIdPrefix = "clientId",
            properties = {"enable.auto.commit:false", "auto.offset.reset:latest"}
    )
    public void listen(String data) {
        System.out.println("Consumed data : " + data);
    }

}
