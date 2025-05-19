package com.security.middlesec.models.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "USUARIOS")
@Valid
@NoArgsConstructor
@AllArgsConstructor
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class UsuarioEntity {

    @@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private String id;

    @Column(value = "User",nullable = false)
    private String username;

    @Column(value = "User",nullable = false)
    private String password;

    @ManyToOne
    private RolesEntity rol;


}
