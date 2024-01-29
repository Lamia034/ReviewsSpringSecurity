package com.example.ReviewsSpringSecurity.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;
@Data
@Entity
public class Review {
    @Id
    @GeneratedValue
    private UUID review_id;
    private String title;
    private String message;
    private LocalDateTime date;
}
