package com.example.ReviewsSpringSecurity.entities;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;
@Data
@Entity
@Table(name="review")
public class Review {
    @Id
    @GeneratedValue
    private UUID review_id;

    private String title;

    private String message;
    private LocalDateTime date;
    @OneToMany(mappedBy = "review",fetch = FetchType.LAZY)
    private List<Reaction> reactions;

    @ManyToOne
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Person person;



    //    private String title;
//    private String message;

//    @OneToMany
//    private List<Reaction> reactions;
//    @ManyToOne
//    private Person person;
}
