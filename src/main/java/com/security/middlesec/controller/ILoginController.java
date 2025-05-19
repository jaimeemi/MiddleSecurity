package com.security.middlesec.controller;

import com.security.middlesec.models.DTO.UsuarioDTO;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/login")
public interface ILoginController {

    @PostMapping("/log")
    public ResponseEntity<UsuarioDTO> login(@Valid @RequestBody UsuarioDTO usuario);

}
