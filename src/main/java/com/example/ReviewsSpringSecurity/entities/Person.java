package com.example.ReviewsSpringSecurity.entities;

import com.example.ReviewsSpringSecurity.enumeration.Role;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.Data;

@Data
@Entity
public class Person {
    @Id
    @GeneratedValue
    private Long person_id;
    private String userName;
    private String password;
    private Role role;
}
