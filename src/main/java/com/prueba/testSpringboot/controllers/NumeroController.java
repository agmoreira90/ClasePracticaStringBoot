package com.prueba.testSpringboot.controllers;
import com.prueba.testSpringboot.entites.Greetting;
import com.prueba.testSpringboot.entites.Numero;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("/numero")
public class NumeroController {

    private final AtomicLong contador = new AtomicLong();

    @GetMapping("/convertir")
    public Numero convertir(@RequestParam(value = "numero", defaultValue = "1") Integer num) {
        Numero numero = new Numero(contador.incrementAndGet(),num);
        numero.convertirANumerosRomanos();
        return numero;
    }

}
