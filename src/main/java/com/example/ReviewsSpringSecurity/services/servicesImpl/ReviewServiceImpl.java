package com.example.ReviewsSpringSecurity.services.servicesImpl;

import com.example.ReviewsSpringSecurity.entities.Review;
import com.example.ReviewsSpringSecurity.repositories.ReviewRepository;
import com.example.ReviewsSpringSecurity.services.ReviewInterface;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class ReviewServiceImpl implements ReviewInterface {

    private final ReviewRepository reviewRepository;

    @Autowired
    public ReviewServiceImpl(ReviewRepository reviewRepository) {
        this.reviewRepository = reviewRepository;
    }

    @Override
    public List<Review> getAllReviews() {
        return reviewRepository.findAll();
    }

    @Override
    public Review saveReview(Review review) {

        review.setDate(LocalDateTime.now());

        return reviewRepository.save(review);
    }

    @Override
    public void deleteReview(UUID id) {
        Optional<Review> optionalReview = reviewRepository.findById(id);
        if (optionalReview.isPresent()) {
            reviewRepository.delete(optionalReview.get());
        } else {
            throw new EntityNotFoundException("Review with id " + id + " not found");
        }
    }
}
