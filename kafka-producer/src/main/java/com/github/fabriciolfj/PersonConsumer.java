package com.github.fabriciolfj;

import io.micronaut.configuration.kafka.annotation.KafkaListener;
import io.micronaut.configuration.kafka.annotation.OffsetReset;
import io.micronaut.configuration.kafka.annotation.Topic;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@KafkaListener(offsetReset = OffsetReset.EARLIEST)
public class PersonConsumer {

    @Topic("person-topic")
    public void receive(final Person person) {
        log.info("Receive msg: {}", person.toString());
    }
}
