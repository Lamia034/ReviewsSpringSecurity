package com.example.ReviewsSpringSecurity.SpringSecurityConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
//
//@Configuration
//public class UserDetailsConfig {
//
//    @Bean
//    public UserDetailsService userDetailsService() {
////        PasswordEncoder passwordEncoder = passwordEncoder();
//        PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
//
//        UserDetails admin = User.withUsername("admin")
//                .password(passwordEncoder.encode("adminPassword"))
//                .roles("ADMIN")
//                .build();
//
//        UserDetails user = User.withUsername("user")
//                .password(passwordEncoder.encode("userPassword"))
//                .roles("USER")
//                .build();
//
//        UserDetails moderator = User.withUsername("moderator")
//                .password(passwordEncoder.encode("moderatorPassword"))
//                .roles("MODERATOR")
//                .build();
//
//        return new InMemoryUserDetailsManager(admin, user, moderator);
//    }
////
////    @Bean
////    public PasswordEncoder passwordEncoder() {
////        return new BCryptPasswordEncoder();
////    }
//}