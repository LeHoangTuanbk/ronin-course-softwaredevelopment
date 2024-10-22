package org.example.lesson4codebasestructure.infrastructure.external;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.beans.factory.annotation.Value;

@Component
public class PaymentGatewayClient {

    private final RestTemplate restTemplate;

    @Value("${payment.gateway.url}")
    private String paymentGatewayUrl;

    public PaymentGatewayClient(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public String processPayment(Long bookingId, Double amount) {
        // Logic to call external payment API
        String requestUrl = paymentGatewayUrl + "/pay";

        // Example API call to the external payment gateway
        PaymentRequest request = new PaymentRequest(bookingId, amount);
        return restTemplate.postForObject(requestUrl, request, String.class);
    }
}

class PaymentRequest {
    private Long bookingId;
    private Double amount;

    public PaymentRequest(Long bookingId, Double amount) {
        this.bookingId = bookingId;
        this.amount = amount;
    }

    // Getters and setters
}
