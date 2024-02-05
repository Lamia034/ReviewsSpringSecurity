package com.example.ReviewsSpringSecurity.services;

import com.example.ReviewsSpringSecurity.entities.Review;

import java.util.List;
import java.util.UUID;

public interface ReviewInterface {
    List<Review> getAllReviews();
    Review saveReview(Review review);
    void deleteReview(UUID id);
}
