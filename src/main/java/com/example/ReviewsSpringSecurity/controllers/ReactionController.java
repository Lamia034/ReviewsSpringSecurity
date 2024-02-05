package com.example.ReviewsSpringSecurity.controllers;

//import com.example.ReviewsSpringSecurity.dtos.ReactionDto;
//import com.example.ReviewsSpringSecurity.dtos.ReactionResponseDto;
import com.example.ReviewsSpringSecurity.entities.Reaction;
import com.example.ReviewsSpringSecurity.repositories.ReactionRepository;
import com.example.ReviewsSpringSecurity.services.ReactionInterface;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/reactions")
public class ReactionController {



}
