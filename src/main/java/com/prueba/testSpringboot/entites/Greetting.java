package com.prueba.testSpringboot.entites;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Greetting {

    private Long id;
    private String message;
    private String type;

}
