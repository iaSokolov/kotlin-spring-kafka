package ru.isokolov.demo.schedule

import mu.KotlinLogging
import org.springframework.context.annotation.Configuration
import org.springframework.scheduling.annotation.EnableScheduling
import org.springframework.scheduling.annotation.Scheduled
import ru.isokolov.demo.kafka.Producer

@Configuration
@EnableScheduling
class EventProduceSchedule(
    private val producer: Producer
) {
    private val logger = KotlinLogging.logger { }

    @Scheduled(fixedDelay = 10_000, initialDelay = 5_000)
    fun send() {
        producer.send(key = "key", value = "value")

        logger.info { "Message send successful" }
    }
}