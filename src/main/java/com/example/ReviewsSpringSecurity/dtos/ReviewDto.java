package com.example.ReviewsSpringSecurity.dtos;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;
@Data
public class ReviewDto {
    private UUID review_id;
    private String title;
    private String message;
    private LocalDateTime date;
}
