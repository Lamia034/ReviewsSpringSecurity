package com.example.ReviewsSpringSecurity.repositories;

import com.example.ReviewsSpringSecurity.entities.Reaction;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ReactionRepository extends JpaRepository<Reaction, UUID> {

}
