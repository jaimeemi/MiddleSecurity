package com.security.middlesec.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@EnableWebSecurity
@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filtrosSeguridad(HttpSecurity http) throws Exception {

        http.
            csrf(csrf -> csrf.disable()).
            authorizeHttpRequests(auth -> auth.
                    requestMatchers("/h2-console/**").permitAll().
                    requestMatchers("/usuarios/**").authenticated().
                    requestMatchers("/login").permitAll().
                    anyRequest().authenticated()
            )
            .httpBasic(Customizer.withDefaults())
            .headers(headers -> headers.frameOptions( config -> config.disable()));

        return http.build();

    }
}
