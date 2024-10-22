package org.example.lesson4codebasestructure.application.booking.dto;

import lombok.Getter;
import lombok.Setter;
import java.time.LocalDate;
@Setter
@Getter
public class BookingRequest {
    private Long flightId;
    private Long userId;
    private LocalDate date;
}
