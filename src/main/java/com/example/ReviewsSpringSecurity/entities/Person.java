package com.example.ReviewsSpringSecurity.entities;

import com.example.ReviewsSpringSecurity.enumeration.Role;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class Person {
    @Id
    @GeneratedValue
    private Long person_id;
    private String userName;
    private String password;
    private Role role;
    @OneToMany
    private List<Reaction> reactions;
}
