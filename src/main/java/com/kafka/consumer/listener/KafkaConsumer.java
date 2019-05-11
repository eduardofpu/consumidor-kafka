package com.kafka.consumer.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    @KafkaListener(topics = "TESTE1", groupId = "group_id")
    public void consume(String message) {
        System.out.println("Consumed message: " + message);
    }


    @KafkaListener(topics = "Kafka_Example", groupId = "group_json",
            containerFactory = "userKafkaListenerFactory")
    public void consumeJson(String str) {
        System.out.println("Consumed JSON Message: " + str);
    }
}
