package com.example.ReviewsSpringSecurity.services.servicesImpl;

import com.example.ReviewsSpringSecurity.dtos.PersonDto;
import com.example.ReviewsSpringSecurity.dtos.PersonResponseDto;
import com.example.ReviewsSpringSecurity.entities.Person;
import com.example.ReviewsSpringSecurity.repositories.PersonRepository;
//import com.example.ReviewsSpringSecurity.services.PersonInterface;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


//@Service
//public class PersonServiceImpl implements PersonInterface, UserDetailsService {
//    private final PersonRepository personRepository;
//    private final ModelMapper modelMapper;
//    private final PasswordEncoder passwordEncoder;
//
//    public PersonServiceImpl(PersonRepository personRepository, ModelMapper modelMapper, PasswordEncoder passwordEncoder) {
//        this.personRepository = personRepository;
//        this.modelMapper = modelMapper;
//        this.passwordEncoder = passwordEncoder;
//    }
//
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        // Implement the logic to load the user details from your PersonRepository
//        // and return a UserDetails object
//        // Example:
//        Person person = personRepository.findByUserName(username);
//        if (person == null) {
//            throw new UsernameNotFoundException("User not found with username: " + username);
//        }
//        return new User(person.getUserName(), person.getPassword(), getAuthorities(person));
//    }
//    public UserDetailsService getUserDetailsService() {
//        return this;
//    }
//    private Collection<? extends GrantedAuthority> getAuthorities(Person person) {
//        // Implement the logic to retrieve the authorities/roles for the user
//        // and return a collection of GrantedAuthority objects
//        // Example:
//        List<GrantedAuthority> authorities = new ArrayList<>();
//        authorities.add(new SimpleGrantedAuthority("ROLE_USER"));
//        return authorities;
//    }
//@Override
//    public void register(PersonDto personDto) {
//        Person person = modelMapper.map(personDto, Person.class);
//        String encodedPassword = passwordEncoder.encode(personDto.getPassword());
//        person.setUserName(personDto.getUserName());
//        person.setPassword(encodedPassword);
//        personRepository.save(person);
//    }
//}








//@Service
//public class PersonServiceImpl implements PersonInterface {
//    private final PersonRepository personRepository;
//    private final ModelMapper modelMapper;
//    private final PasswordEncoder passwordEncoder;
//
//    public PersonServiceImpl(PersonRepository personRepository, ModelMapper modelMapper, PasswordEncoder passwordEncoder) {
//        this.personRepository = personRepository;
//        this.modelMapper = modelMapper;
//        this.passwordEncoder = passwordEncoder;
//    }
//
//    @Override
//    public void register(PersonDto personDto) {
//        Person person = modelMapper.map(personDto, Person.class);
//        String encodedPassword = passwordEncoder.encode(personDto.getPassword());
//        person.setUserName(personDto.getUserName());
//        person.setPassword(encodedPassword);
//        personRepository.save(person);
//    }
//
//
//
//}