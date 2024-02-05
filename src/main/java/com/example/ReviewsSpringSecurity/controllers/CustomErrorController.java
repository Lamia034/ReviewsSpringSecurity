package com.example.ReviewsSpringSecurity.controllers;


import ch.qos.logback.core.model.Model;
import com.example.ReviewsSpringSecurity.entities.Review;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
    public class CustomErrorController implements ErrorController {

        @RequestMapping("/error")
        public ModelAndView handleError(HttpServletRequest request, Model model) {
            Object status = request.getAttribute(RequestDispatcher.ERROR_STATUS_CODE);

            if (status != null) {
                int statusCode = Integer.parseInt(status.toString());

                if (statusCode == HttpStatus.NOT_FOUND.value()) {
                    ModelAndView modelAndView = new ModelAndView("/error");
                    modelAndView.addObject("error", "404 Not Found");
                    return modelAndView;
//                    model.addAttribute("error", "404 Not Found");
                } else if (statusCode == HttpStatus.INTERNAL_SERVER_ERROR.value()) {
                    ModelAndView modelAndView = new ModelAndView("/error");
                    modelAndView.addObject("error", "500 Internal Server Error");
                    return modelAndView;
//                    model.addAttribute("error", "500 Internal Server Error");
                } else {
                    ModelAndView modelAndView = new ModelAndView("/error");
                    modelAndView.addObject("error", "Unexpected Error");
                    return modelAndView;
//                    model.addAttribute("error", "Unexpected Error");
                }
            } else {
                ModelAndView modelAndView = new ModelAndView("/error");
                modelAndView.addObject("error", "Unknown Error");
                return modelAndView;
//                model.addAttribute("error", "Unknown Error");
            }

//            return "error";
        }

//        @Override
//        public String getErrorPath() {
//            return "/error";
//        }
    }
