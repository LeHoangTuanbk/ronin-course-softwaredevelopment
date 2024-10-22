package org.example.lesson4codebasestructure.infrastructure.messaging;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class BookingMessageProducer {

    private final AmqpTemplate amqpTemplate;

    @Value("${rabbitmq.exchange}")
    private String exchange;

    @Value("${rabbitmq.routingKey}")
    private String routingKey;

    public BookingMessageProducer(AmqpTemplate amqpTemplate) {
        this.amqpTemplate = amqpTemplate;
    }

    public void sendBookingCreatedMessage(BookingMessage message) {
        amqpTemplate.convertAndSend(exchange, routingKey, message);
        System.out.println("Booking message sent: " + message);
    }
}

class BookingMessage {
    private Long bookingId;
    private String flightNumber;

    public BookingMessage(Long bookingId, String flightNumber) {
        this.bookingId = bookingId;
        this.flightNumber = flightNumber;
    }

    // Getters and setters
}
