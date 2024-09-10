package com.BookingManagement.BookingManagementSystem.repository;

import com.BookingManagement.BookingManagementSystem.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email); // Custom query method
}