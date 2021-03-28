package com.prueba.testSpringboot.entites;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Codigo {

    private Long id;
    private String codigoMorse;
    private String codigoTraducido;

}
