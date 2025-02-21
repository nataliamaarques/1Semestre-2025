package com.fatec.projeto.projeto2025.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class ExercicioController   {
@GetMapping("")

    public String HelloWorld1(@PathVariable String nome){
        return "Hello";
    }

/*@GetMapping("{nome}")

    public String HelloWorld(@PathVariable String nome){
        return nome;
    }*/

    
/*@GetMapping("{nome}")
    public String HelloWorld(@PathVariable Optional<String> nome){
        return nome.isPresent() ? nome.get() : "dd";
    }*/
    
}
