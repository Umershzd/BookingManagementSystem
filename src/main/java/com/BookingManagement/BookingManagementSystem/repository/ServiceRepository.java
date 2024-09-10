package com.BookingManagement.BookingManagementSystem.repository;
import com.BookingManagement.BookingManagementSystem.model.Service;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceRepository extends JpaRepository<Service, Long> {
}