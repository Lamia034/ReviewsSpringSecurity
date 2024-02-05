package com.example.ReviewsSpringSecurity.controllers;

import com.example.ReviewsSpringSecurity.dtos.LoginDto;
import com.example.ReviewsSpringSecurity.dtos.RegistrationDto;
import com.example.ReviewsSpringSecurity.entities.Person;
import com.example.ReviewsSpringSecurity.enumeration.Role;
import com.example.ReviewsSpringSecurity.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController
//@RequestMapping("/authentication")
//public class AuthenticationController {
//    private final PersonRepository personRepository;
//    private final PasswordEncoder passwordEncoder;
//    private final AuthenticationManager authenticationManager;
//
//@Autowired
//    public AuthenticationController(PersonRepository personRepository, PasswordEncoder passwordEncoder,
//                                    AuthenticationManager authenticationManager) {
//        this.personRepository = personRepository;
//        this.passwordEncoder = passwordEncoder;
//        this.authenticationManager = authenticationManager;
//    }
//
//
//
//
//    @PostMapping("/signup")
//    public ResponseEntity<String> signUp(@RequestBody RegistrationDto request) {
//        String username = request.getUserName();
//        String password = request.getPassword();
//
//        if (personRepository.findByUserName(username).isPresent()) {
//            return ResponseEntity.badRequest().body("Username already exists");
//        }
//
//        Person person = new Person();
//        person.setUserName(username);
//        person.setPassword(passwordEncoder.encode(password));
//        person.setRole(Role.USER);
//
//        personRepository.save(person);
//
//        return ResponseEntity.ok("User registered successfully");
//    }
//
//    @PostMapping("/signin")
//    public ResponseEntity<String> signIn(@RequestBody LoginDto request) {
//        String username = request.getUserName();
//        String password = request.getPassword();
//
//        try {
//            Authentication authentication = authenticationManager.authenticate(
//                    new UsernamePasswordAuthenticationToken(username, password)
//            );
//
//            UserDetails userDetails = (UserDetails) authentication.getPrincipal();
//            // You can add additional logic here based on successful authentication
//
//            return ResponseEntity.ok("User signed in successfully");
//        } catch (Exception e) {
//            return ResponseEntity.badRequest().body("Invalid username or password");
//        }
//    }
//}
