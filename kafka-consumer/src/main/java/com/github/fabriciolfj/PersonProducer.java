package com.github.fabriciolfj;

import io.micronaut.configuration.kafka.annotation.KafkaClient;
import io.micronaut.configuration.kafka.annotation.Topic;

@KafkaClient
public interface PersonProducer {

    @Topic("person-topic")
    void sendPerson(final Person person);


}
