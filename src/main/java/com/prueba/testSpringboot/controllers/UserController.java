package com.prueba.testSpringboot.controllers;

import com.prueba.testSpringboot.entites.Greetting;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("/user")
public class UserController {

    private final AtomicLong contador = new AtomicLong();

    @GetMapping("/hi")
    public Greetting sayHi(@RequestParam(value = "name", defaultValue = "World") String name) {
        Greetting greetting = new Greetting(contador.incrementAndGet(),
                "Hi, " + name + " how are you?",
                this.getClass().getSimpleName());
        return greetting;
    }


    @GetMapping("/bye/{name}")
    public Greetting sayBye(@PathVariable(value = "name") String nameUrl) {
        Greetting greetting = new Greetting(contador.incrementAndGet(),
                "Bye, " + nameUrl + "see you later",
                this.getClass().getSimpleName());
        return greetting;
    }
}
