package ru.isokolov.demo.kafka

import org.springframework.beans.factory.annotation.Value
import org.springframework.kafka.core.KafkaTemplate
import org.springframework.stereotype.Component

@Component
class Producer(
    @Value("\${application.kafka.topic.out}")
    private val topic: String,

    private val kafkaTemplate: KafkaTemplate<String, Any>,
) {
    fun send(key: String, value: String) {
        kafkaTemplate.send(topic, key, value)
    }
}