package ru.isokolov.demo.kafka

import mu.KotlinLogging
import org.springframework.kafka.annotation.KafkaListener
import org.springframework.stereotype.Component

@Component
class Listener() {
    private val logger = KotlinLogging.logger { }

    @KafkaListener(
        topics = ["in-events"],
        groupId = "app-group"
    )
    fun consume(event: String) {
        logger.info { "Event message: \"$event\"" }
    }
}