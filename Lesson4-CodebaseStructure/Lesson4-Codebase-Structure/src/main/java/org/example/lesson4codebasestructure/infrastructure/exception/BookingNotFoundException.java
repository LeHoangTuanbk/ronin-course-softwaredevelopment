package org.example.lesson4codebasestructure.infrastructure.exception;

public class BookingNotFoundException extends RuntimeException {

    public BookingNotFoundException(Long id) {
        super("Booking with ID " + id + " not found.");
    }
}