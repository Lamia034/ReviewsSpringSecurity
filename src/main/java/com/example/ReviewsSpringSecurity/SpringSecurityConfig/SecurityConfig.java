package com.example.ReviewsSpringSecurity.SpringSecurityConfig;
//
//import com.example.ReviewsSpringSecurity.services.PersonInterface;
//import com.example.ReviewsSpringSecurity.services.servicesImpl.PersonServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configurers.userdetails.DaoAuthenticationConfigurer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.*;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.SecurityBuilder;
import org.springframework.security.config.annotation.SecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.SecurityBuilder;
import org.springframework.security.config.annotation.SecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.config.annotation.web.configurers.ExpressionUrlAuthorizationConfigurer;
import org.springframework.security.config.annotation.web.configurers.HttpBasicConfigurer;
import org.springframework.security.config.annotation.web.configurers.RememberMeConfigurer;
import org.springframework.security.config.annotation.web.configurers.SessionManagementConfigurer;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.crypto.password.PasswordEncoder;



@Configuration
@EnableWebSecurity
public class SecurityConfig {
//    @Autowired
//    private UserDetailsConfig userDetailsConfig;
////@Autowired
//private PersonServiceImpl personServiceImpl;
//private PersonInterface personInterface;
////@Autowired
//    private PasswordEncoder passwordEncoder;
//@Autowired
//public SecurityConfig(PersonInterface personInterface , PasswordEncoder passwordEncoder) {
//    this.personInterface = personInterface;
//    this.passwordEncoder =  passwordEncoder;
//}





    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
        httpSecurity
                .authorizeRequests(authorize -> authorize
                        .requestMatchers("/**").permitAll()
                        .requestMatchers("/admin/**").hasRole("ADMIN")
                        .requestMatchers("/user/**").hasAnyRole("USER", "ADMIN")
                        .anyRequest().authenticated()
                )
                .formLogin(formLogin -> formLogin
                        .loginPage("/login")
                        .permitAll()
                )
                .logout(LogoutConfigurer::permitAll);

//        configure(httpSecurity.getSharedObject(AuthenticationManagerBuilder.class));

        return httpSecurity.build();
    }

//    private void configure(AuthenticationManagerBuilder builder) throws Exception {
////        builder.userDetailsService(personInterface).passwordEncoder(passwordEncoder);
//        builder.userDetailsService(personServiceImpl.getUserDetailsService()).passwordEncoder(passwordEncoder);
//
//    }
//

//
//    @Bean
//    public PasswordEncoder passwordEncoder() {
//        return new BCryptPasswordEncoder();
//    }









































//    @Bean
//    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
//        httpSecurity
//                .authorizeRequests(authorize -> authorize
//                        .requestMatchers("/registration").permitAll()
//                        .requestMatchers("/admin/**").hasRole("ADMIN")
//                        .requestMatchers("/user/**").hasAnyRole("USER", "ADMIN")
//                        .anyRequest().authenticated()
//                )
//                .formLogin(formLogin -> formLogin
//                        .loginPage("/login")
//                        .permitAll()
//                )
//                .logout(LogoutConfigurer::permitAll
//                )
//        ;
//
//        return httpSecurity.build();
//    }
//
//    public void configure(AuthenticationManagerBuilder builder) throws Exception{
//        builder.userDetailsService(personService).passwordEncoder(passwordEncoder);
//    }
































//@Bean
//public AuthenticationManager authenticationManager(HttpSecurity http, PasswordEncoder passwordEncoder, UserDetailsService userDetailsService) throws Exception {
//    http
//            .authenticationProvider(authenticationProvider(passwordEncoder, userDetailsService))
//            .authorizeRequests(authorize -> authorize
//                    .requestMatchers("/registration").permitAll()
//                    .requestMatchers("/admin/**").hasRole("ADMIN")
//                    .requestMatchers("/user/**").hasAnyRole("USER", "ADMIN")
//                    .anyRequest().authenticated()
//            )
//            .formLogin(formLogin -> formLogin
//                    .loginPage("/login")
//                    .permitAll()
//            )
//            .logout(LogoutConfigurer::permitAll);
//
//    return http.getSharedObject(AuthenticationManager.class);
//}

//
//    private AuthenticationProvider authenticationProvider(PasswordEncoder passwordEncoder, UserDetailsService userDetailsService) {
//        DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
//        provider.setPasswordEncoder(passwordEncoder);
//        provider.setUserDetailsService(userDetailsService);
//        return provider;
//    }
//    @Autowired
//    private UserDetailsService userDetailsService;
//    @Autowired
//    public void configure(AuthenticationManagerBuilder auth, UserDetailsService userDetailsService) throws Exception {
//        auth.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder());
//    }






//private final UserDetailsService userDetailsService;
//
//    public SecurityConfig(UserDetailsService userDetailsService) {
//        this.userDetailsService = userDetailsService;
//    }

//    @Autowired
//    public void configure(AuthenticationManagerBuilder auth) throws Exception {
//        auth.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder());
//    }
    }
//@EnableWebSecurity
//@Configuration
//public class SecurityConfig {
////    private final PersonRepository personRepository;
////    private final PasswordEncoder passwordEncoder;
////
////    public SecurityConfig(PersonRepository personRepository, PasswordEncoder passwordEncoder) {
////        this.personRepository = personRepository;
////        this.passwordEncoder = passwordEncoder;
////    }
//
//    @Autowired
//    private PersonRepository personRepository;
//
//    @Autowired
//    private PasswordEncoder passwordEncoder;
//
//    @Bean
//    public AuthenticationManager authenticationManager(AuthenticationManagerBuilder authenticationManagerBuilder) throws Exception {
//        authenticationManagerBuilder
//                .userDetailsService(userDetailsService())
//                .passwordEncoder(passwordEncoder);
//
//        return authenticationManagerBuilder.build();
//    }
//
//    @Bean
//    public UserDetailsService userDetailsService() {
////        return username -> personRepository.findByUserName(username)
////                .map(this::buildUserDetails)
////                .orElseThrow(() -> new UsernameNotFoundException("Person not found"));
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
//
//    private UserDetails buildUserDetails(Person person) {
//        return User.withUsername(person.getUserName())
//                .password(person.getPassword())
//                .roles(person.getRole().toString())
//                .build();
//    }
//
//    @Bean
//    public PasswordEncoder passwordEncoder() {
//        return new BCryptPasswordEncoder();
//    }
//}

//@EnableWebSecurity
//@Configuration
//public class SecurityConfig {
//    private final PersonRepository personRepository;
//
//    public SecurityConfig(PersonRepository personRepository) {
//        this.personRepository = personRepository;
//    }
//
//    @Bean
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        auth.userDetailsService(userDetailsService()).passwordEncoder(passwordEncoder());
//    }
//
//    @Bean
//    protected void configure(HttpSecurity http) throws Exception {
//        http
//                .authorizeRequests()
//                .requestMatchers("/authentication/signup").permitAll()  // Allow registration without authentication
//                .requestMatchers("/authentication/signin").permitAll()  // Allow login without authentication
//                .anyRequest().authenticated()
//                .and()
//                                .formLogin(formLogin ->
//                        formLogin
//                                .loginPage("/login")
//                                .permitAll()
//                )
//                .logout(logout ->
//                        logout.permitAll()
//                );
//
//    }
//
//    @Bean
//    public UserDetailsService userDetailsService() {
//        return username -> personRepository.findByUserName(username)
//                .map(this::buildUserDetails)
//                .orElseThrow(() -> new UsernameNotFoundException("Person not found"));
//    }
//
//    private UserDetails buildUserDetails(Person person) {
//        return User.withUsername(person.getUserName())
//                .password(person.getPassword())
//                .roles(person.getRole().toString())
//                .build();
//    }
//
//    @Bean
//    public PasswordEncoder passwordEncoder() {
//        return new BCryptPasswordEncoder();
//    }
//}

//@EnableWebSecurity
//@Configuration
//public class SecurityConfig  {
//    private final PersonRepository personRepository;
////    private final PasswordEncoder passwordEncoder;
//
//    public SecurityConfig(PersonRepository personRepository) {
//        this.personRepository = personRepository;
////        this.passwordEncoder = passwordEncoder;
//    }
//    @Bean
//    public AuthenticationManager authenticationManager(AuthenticationManagerBuilder authenticationManagerBuilder) throws Exception {
//        authenticationManagerBuilder
//                .inMemoryAuthentication()
//                .withUser("user")
//                .password(passwordEncoder().encode("password"))
//                .roles("USER")
//                .and()
//                .withUser("admin")
//                .password(passwordEncoder().encode("admin"))
//                .roles("ADMIN");
//
//        return authenticationManagerBuilder.build();
//    }
//
//    @Bean
//    public UserDetailsService userDetailsService() {
//        return username -> personRepository.findByUserName(username)
//                .map(this::buildUserDetails)
//                .orElseThrow(() -> new UsernameNotFoundException("Person not found"));
//    }
//
//    private UserDetails buildUserDetails(Person person) {
//        return User.withUsername(person.getUserName())
//                .password(person.getPassword())
//                .roles(person.getRole().toString())
//                .build();
//    }
//
//    @Bean
//    public PasswordEncoder passwordEncoder() {
//        return new BCryptPasswordEncoder();
//    }
//
//}

//@Configuration
//@EnableWebSecurity
//public class SecurityConfig {
//
//    @Bean
//    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//        http
//                .authorizeRequests(authorizeRequests ->
//                        authorizeRequests
//                                .requestMatchers("/", "/home").permitAll()
//                                .requestMatchers("/admin/**").hasRole("ADMIN")
//                                .requestMatchers("/user/**").hasRole("USER")
//                                .requestMatchers("/moderator/**").hasRole("MODERATOR")
//                                .anyRequest().authenticated()
//                )
//                .formLogin(formLogin ->
//                        formLogin
//                                .loginPage("/login")
//                                .permitAll()
//                )
//                .logout(logout ->
//                        logout.permitAll()
//                );
//
//        return http.build();
//    }
//
//    @Bean
//    public UserDetailsService userDetailsService() {
//        UserDetails user = User.builder()
//                .username("user")
//                .password(passwordEncoder().encode("password"))
//                .roles("USER")
//                .build();
//
//        return new InMemoryUserDetailsManager(user);
//    }
//
//    @Bean
//    public PasswordEncoder passwordEncoder() {
//        return new BCryptPasswordEncoder();
//    }
//}

//@Configuration
//@EnableWebSecurity
//public class SecurityConfig {
//
//    @Bean
//    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//        http
//                .authorizeHttpRequests((requests) -> requests
//                        .requestMatchers("/", "/home").permitAll()
//                        .anyRequest().authenticated()
//                )
//                .formLogin((form) -> form
//                        .loginPage("/login")
//                        .permitAll()
//                )
//                .logout((logout) -> logout.permitAll());
//
//        return http.build();
//    }
//
//
//
//    @Bean
//    public UserDetailsService userDetailsService() {
//        UserDetails user =
//                User.withDefaultPasswordEncoder()
//                        .username("user")
//                        .password("password")
//                        .roles("USER")
//                        .build();
//
//        return new InMemoryUserDetailsManager(user);
//    }
//}

