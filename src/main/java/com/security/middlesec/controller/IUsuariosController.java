package com.security.middlesec.controller;

import com.security.middlesec.models.DTO.UsuarioDTO;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/usuarios")
@Validated
public interface IUsuariosController {

    @GetMapping("/listar")
    public ResponseEntity<UsuarioDTO> listar();

    @GetMapping("/{idUser}}")
    public ResponseEntity<UsuarioDTO> producto(@Valid @PathVariable Long idUser);

    @PostMapping("/registrar")
    public ResponseEntity<UsuarioDTO> registrar(@Valid @RequestBody UsuarioDTO usuario);

    @PutMapping("/editar")
    public ResponseEntity<UsuarioDTO> editar(@Valid @PathVariable Long id , @Valid @RequestBody UsuarioDTO usuario);

    @DeleteMapping("/eliminar")
    public ResponseEntity<UsuarioDTO> eliminar(@Valid @PathVariable Long id);


}
