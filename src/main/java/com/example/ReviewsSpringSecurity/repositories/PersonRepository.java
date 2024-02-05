package com.example.ReviewsSpringSecurity.repositories;

import com.example.ReviewsSpringSecurity.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface PersonRepository extends JpaRepository<Person, UUID> {
    Person findByUserName(String userName);
}
