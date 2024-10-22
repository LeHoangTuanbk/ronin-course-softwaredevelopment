package org.example.lesson4codebasestructure.application.booking.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import java.time.LocalDate;

@Entity
@Getter
@Setter
public class BookingModel {
    @jakarta.persistence.Id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long flightId;
    private Long userId;
    private LocalDate date;
}
