package org.example.lesson4codebasestructure.application.booking.repository;

import org.example.lesson4codebasestructure.application.booking.model.BookingModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingRepository extends JpaRepository<BookingModel, Long> {
}