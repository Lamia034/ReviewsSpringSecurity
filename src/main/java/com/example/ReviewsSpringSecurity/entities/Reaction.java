package com.example.ReviewsSpringSecurity.entities;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.util.UUID;

@Data
@Entity
@Table(name="reaction")
public class Reaction {
    @Id
    @GeneratedValue
    private UUID reaction_id;


    @ManyToOne
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Person person;

    @ManyToOne
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Review review;
    //    @ManyToOne()
//    private Person person;
//    @ManyToOne()
//    private Review review;
}
