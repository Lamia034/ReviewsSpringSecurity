package com.example.demo.controller;

import com.example.demo.model.entity.Review;
import com.example.demo.model.request.ReviewReqDto;
import com.example.demo.model.response.ReviewResDto;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AppController {

    @GetMapping("")
    public String loginPage(){
        return "login";
    }


//    @GetMapping("/home")
//    public String homePage(){
//        return "home";
//    }
//    @GetMapping("/review")
//    public String reviewPage(){
//        return "review";
//    }
//@GetMapping("/review")
//public String reviewPage(Model model) {
//    ReviewResDto review = new ReviewResDto();
//    model.addAttribute("review", review);
//    return "review";
//}
//
//    @GetMapping("/review")
//    public String reviewsPage(){
//        return "reviews";
//    }


}
