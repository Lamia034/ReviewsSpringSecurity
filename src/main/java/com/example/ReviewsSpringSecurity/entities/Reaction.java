package com.example.ReviewsSpringSecurity.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.UUID;

@Data
@Entity
public class Reaction {
    @Id
    @GeneratedValue
    private UUID reaction_id;
    private UUID person_id;
    private UUID review_id;
}
