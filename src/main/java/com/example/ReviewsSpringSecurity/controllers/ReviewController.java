package com.example.ReviewsSpringSecurity.controllers;

import ch.qos.logback.core.model.Model;
import com.example.ReviewsSpringSecurity.entities.Person;
import com.example.ReviewsSpringSecurity.entities.Review;
//import com.example.ReviewsSpringSecurity.services.PersonInterface;
import com.example.ReviewsSpringSecurity.services.ReviewInterface;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("/reviews")
public class ReviewController {

    private ReviewInterface reviewInterface;

    public ReviewController(ReviewInterface reviewInterface){
        this.reviewInterface = reviewInterface;
    }
    @PostMapping("/delete/{review_id}")
//    @GetMapping("/{review_id}/delete")
    public String deleteReview(@PathVariable UUID reviewId) {
        try {
            System.out.println("Received Review ID: " + reviewId);
            reviewInterface.deleteReview(reviewId);
            return "redirect:/reviews";
        } catch (EntityNotFoundException e) {
            return "redirect:/error";
        }
    }

    @GetMapping("/new")
    public ModelAndView showReviewForm() {
        ModelAndView modelAndView = new ModelAndView("/review");
        modelAndView.addObject("review", new Review());
        return modelAndView;
    }

    @PostMapping("/save")
    public String saveReview(@ModelAttribute Review review) {
        reviewInterface.saveReview(review);
        return "redirect:/reviews";
    }



    @GetMapping
    public ModelAndView listReviews() {
        List<Review> reviews = reviewInterface.getAllReviews();

        ModelAndView modelAndView = new ModelAndView("/reviews");
        modelAndView.addObject("reviews", reviews);
        return modelAndView;
    }
//
//    @GetMapping("/{id}")
//    public String viewReview(@PathVariable UUID id, Model model) {
//        Review review = reviewInterface.getReviewById(id);
//        model.addAttribute("review", review);
//        return "reviews/view";
//    }
//
//    @GetMapping("/{id}/edit")
//    public String editReview(@PathVariable UUID id, Model model) {
//        Review review = reviewInterface.getReviewById(id);
//        model.addAttribute("review", review);
//        return "reviews/form";
//    }
//

}
