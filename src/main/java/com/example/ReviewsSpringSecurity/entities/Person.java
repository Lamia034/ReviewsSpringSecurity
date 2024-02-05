package com.example.ReviewsSpringSecurity.entities;

import com.example.ReviewsSpringSecurity.enumeration.Role;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
import java.util.UUID;

@Data
@Entity
@Table(name="person")
public class Person {
    @Id
    @GeneratedValue
    private UUID person_id;
    private String userName;

    private String password;

    @Enumerated(EnumType.STRING)
    private Role role;

    @OneToMany(mappedBy = "person",fetch = FetchType.LAZY)
    private List<Reaction> reactions;

    @OneToMany(mappedBy = "person",fetch = FetchType.LAZY)
    private List<Review> reviews;

//    private String userName;
//    private String password;
//    private Role role;
//    @OneToMany
//    private List<Reaction> reactions;
//    @OneToMany
//    private List<Review> reviews;

}
