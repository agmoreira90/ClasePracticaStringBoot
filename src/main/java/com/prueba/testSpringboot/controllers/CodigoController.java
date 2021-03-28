package com.prueba.testSpringboot.controllers;

import com.prueba.testSpringboot.domain.CodigoMorseImp;
import com.prueba.testSpringboot.entites.Codigo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("/codigomorse")
public class CodigoController {
    private final AtomicLong contador = new AtomicLong();

    @GetMapping("/decodificar")
    public Codigo decodificar(@RequestParam(value = "codigo", defaultValue = "Codigo Erroneo")String codigo){
        Codigo codigo1 = new Codigo(this.contador.incrementAndGet(),codigo, CodigoMorseImp.decodificarMorse(codigo));
        return codigo1;
    }

    @GetMapping("/codificar")
    public Codigo codificar(@RequestParam(value = "codigo", defaultValue = "Codigo Erroneo")String codigo){
        Codigo codigo1 = new Codigo(this.contador.incrementAndGet(),CodigoMorseImp.codificarMorse(codigo),codigo);
        return codigo1;
    }
}
