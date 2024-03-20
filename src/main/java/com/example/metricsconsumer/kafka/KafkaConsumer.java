package com.example.metricsconsumer.kafka;

import com.example.metricsconsumer.model.Metric;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;


@Slf4j
@Component
public class KafkaConsumer {

    @KafkaListener(topics="metrics-topic", groupId="metrics-consumer")
    public void listenTopic(Metric metric) {
        log.info("Metric {} consumed", metric);
    }
}
