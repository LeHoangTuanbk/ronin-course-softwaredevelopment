package org.example.lesson4codebasestructure.application.booking.service;

import org.example.lesson4codebasestructure.application.booking.dto.BookingRequest;
import org.example.lesson4codebasestructure.application.booking.model.BookingModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookingService {
    public BookingModel createBooking(BookingRequest bookingRequest) {
        //Create a new booking
        //....
        //Return the created booking
        return new BookingModel();
    }

    public List<BookingModel> getAllBookings() {
        //Get all bookings
        //....
        //Return all bookings
        return new ArrayList<>();
    }

    public BookingModel getBookingById(Long id) {
        //Get booking by id
        //....
        //Return the booking
        return new BookingModel();
    }
}
