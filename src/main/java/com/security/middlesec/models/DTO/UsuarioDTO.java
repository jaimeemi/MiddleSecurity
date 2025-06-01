package com.security.middlesec.models.DTO;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class UsuarioDTO {

    private Long id;

    @NotBlank(message = "El username no puede estar vacio")
    private String username;

    @NotBlank(message = "El password no puede estar vacio")
    private String password;

}
