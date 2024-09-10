package com.BookingManagement.BookingManagementSystem.repository;

import com.BookingManagement.BookingManagementSystem.model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookingRepository extends JpaRepository<Booking, Long> {
    List<Booking> findByUserId(Long userId); // Custom query method to find bookings by user ID
}