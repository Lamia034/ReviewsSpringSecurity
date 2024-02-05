package com.example.ReviewsSpringSecurity.repositories;

import com.example.ReviewsSpringSecurity.entities.Review;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ReviewRepository extends JpaRepository<Review, UUID> {
}
