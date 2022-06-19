package me.yongil.spring_kafka.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import me.yongil.spring_kafka.service.KafkaProducer;

/**
 * @author yongil.kwon@linecorp.com
 */
@RestController
public class SendController {
    final KafkaProducer kafkaProducer;

    public SendController(KafkaProducer kafkaProducer) {this.kafkaProducer = kafkaProducer;}

    @GetMapping("/send")
    public String send(@RequestParam("text") String text) {
        kafkaProducer.send(text);
        return text;
    }

    @GetMapping("/onlySend")
    public String onlySend(@RequestParam("text") String text) {
        kafkaProducer.send(text);
        return text;
    }
}
