package com.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

        // Disable CSRF
        http.csrf(customizer -> customizer.disable());
        // Enable authentication for all requests
        http.authorizeHttpRequests(request -> request.anyRequest().authenticated());
        // http.formLogin(formLogin -> formLogin.loginPage("/login"));
        // http.formLogin(Customizer.withDefaults());
        // Enable form login and HTTP basic authentication
        http.httpBasic(Customizer.withDefaults());
        // Disable session management and use stateless sessions
        http.sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS));

        return http.build();
    }
}
