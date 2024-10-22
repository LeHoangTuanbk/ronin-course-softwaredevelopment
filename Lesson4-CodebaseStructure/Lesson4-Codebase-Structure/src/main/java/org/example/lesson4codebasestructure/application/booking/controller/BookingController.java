package org.example.lesson4codebasestructure.application.booking.controller;

import org.example.lesson4codebasestructure.application.booking.dto.BookingRequest;
import org.example.lesson4codebasestructure.application.booking.model.BookingModel;
import org.example.lesson4codebasestructure.application.booking.service.BookingService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/bookings")
public class BookingController {

    private final BookingService bookingService;

    public BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    @PostMapping
    public ResponseEntity<BookingModel> createBooking(@RequestBody BookingRequest bookingRequest) {
        BookingModel booking = bookingService.createBooking(bookingRequest);
        return ResponseEntity.ok(booking);
    }

    @GetMapping
    public ResponseEntity<List<BookingModel>> getAllBookings() {
        List<BookingModel> bookings = bookingService.getAllBookings();
        return ResponseEntity.ok(bookings);
    }

    @GetMapping("/{id}")
    public ResponseEntity<BookingModel> getBookingById(@PathVariable Long id) {
        BookingModel booking = bookingService.getBookingById(id);
        return ResponseEntity.ok(booking);
    }
}