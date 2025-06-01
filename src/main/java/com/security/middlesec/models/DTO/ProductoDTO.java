package com.security.middlesec.models.DTO;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;

@Valid
@AllArgsConstructor
@Data
public class ProductoDTO {

    private Long id;

    @NotBlank(message = "El nombre no puede estar vacio")
    private String nombre;

    @NotBlank(message = "El precio no puede estar vacio")
    private String password;

}
