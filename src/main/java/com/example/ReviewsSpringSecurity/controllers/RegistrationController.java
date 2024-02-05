package com.example.ReviewsSpringSecurity.controllers;

import ch.qos.logback.core.model.Model;
import com.example.ReviewsSpringSecurity.dtos.PersonDto;
import com.example.ReviewsSpringSecurity.dtos.RegistrationDto;
import com.example.ReviewsSpringSecurity.entities.Person;
import com.example.ReviewsSpringSecurity.repositories.PersonRepository;
//import com.example.ReviewsSpringSecurity.services.PersonInterface;
//import com.example.ReviewsSpringSecurity.services.servicesImpl.PersonServiceImpl;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

//@Controller
//@RequestMapping("/registration")
//public class RegistrationController {
//
////    @Autowired
//    private PersonInterface personInterface;
//    public RegistrationController(PersonInterface personInterface){
//        this.personInterface = personInterface;
//    }
//
//    @GetMapping()
//    public ModelAndView showRegistrationForm() {
//        ModelAndView modelAndView = new ModelAndView("/registration");
//        modelAndView.addObject("person", new Person());
//        return modelAndView;
//    }
//    @PostMapping()
//    public String processRegistrationForm(@ModelAttribute("person") PersonDto personDto) {
////        personRepository.save(person);
//        personInterface.register(personDto);
//        return "redirect:/registration/success"; // Redirect to a success page
//    }
//
//    @GetMapping("/registration/success")
//    public String showRegistrationSuccessPage() {
//        return "registration-success"; // Return a success page
//    }
//}

//@RestController
//@RequestMapping("/registration")
//public class RegistrationController {
//
//    @Autowired
//    private PersonInterface personInterface; // Use the interface instead of the implementation
//
//    @GetMapping()
//    public ModelAndView showRegistrationForm() {
//        ModelAndView modelAndView = new ModelAndView("/registration");
//        modelAndView.addObject("person", new Person());
//        return modelAndView;
//    }
//
//    @PostMapping()
//    public String processRegistrationForm(@ModelAttribute("person") PersonDto personDto) {
//        personInterface.register(personDto); // Use the interface method
//        return "redirect:/registration/success"; // Redirect to a success page
//    }
//
//    @GetMapping("/registration/success")
//    public String showRegistrationSuccessPage() {
//        return "registration-success"; // Return a success page
//    }
//}
//@Controller
//public class RegistrationController {
//
//    @Autowired
//    private PersonInterface personInterface;
//
//    @GetMapping("/registration")
//    public String showRegistrationForm() {
//        return "registration";
//    }
//
//    @PostMapping("/registration")
//    public String processRegistrationForm(@ModelAttribute("person") PersonDto person) {
//        personInterface.register(person);
//        return "redirect:/login";
//    }
//}
//@Controller
//    public class RegistrationController {
//        private final RegistrationService userService;
//
//        public RegistrationController(RegistrationService userService) {
//            this.userService = userService;
//        }
//
//        @GetMapping("/registration")
//        public String showRegistrationForm(Model model) {
//            model.addAttribute("userDto", new RegistrationDto());
//            return "registration";
//        }
//
//        @PostMapping("/registration")
//        public String registerRegistration(@ModelAttribute("userDto") @Valid RegistrationDto userDto, BindingResult bindingResult) {
//            if (bindingResult.hasErrors()) {
//                return "registration";
//            }
//
//            userService.registerRegistration(userDto);
//            return "redirect:/login?registered";
//        }
//    }