package org.example.lesson4codebasestructure.infrastructure.exception;

public class FlightNotAvailableException extends RuntimeException {

    public FlightNotAvailableException(String flightNumber) {
        super("Flight with number " + flightNumber + " is not available.");
    }
}