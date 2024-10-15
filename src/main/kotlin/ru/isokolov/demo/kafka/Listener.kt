package ru.isokolov.demo.kafka

import org.springframework.kafka.annotation.KafkaListener
import org.springframework.stereotype.Component

@Component
class Listener(
) {
    @KafkaListener(
        topics = ["test"],
        groupId = "group1"
    )
    fun consume(value: String) {
        println(value)
    }
}