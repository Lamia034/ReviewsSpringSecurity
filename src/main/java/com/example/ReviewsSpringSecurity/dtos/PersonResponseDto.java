package com.example.ReviewsSpringSecurity.dtos;

import com.example.ReviewsSpringSecurity.enumeration.Role;
import lombok.Data;

@Data
public class PersonResponseDto {
    private Long person_id;
    private String userName;
    private String password;
    private Role role;
}
