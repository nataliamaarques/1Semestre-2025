package com.fatec.projeto.projeto2025.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExercicioController   {
/*@GetMapping("")

    public String HelloWorld1(){
        return "Hello";
    }*/
     
   /*resolução do professor
   @GetMapping("/get-idade/{idade}")
   public String retornaIdade(Integer idade){
        try{
            if(idade < 0){
                throw new NumberFormatException()
            };
            if(idade < 12) {
                return "Criança";
            }else if(idade <= 18){
                return "Adolescente";
            }else if(idade <= 60){
                return "Adulto";
            }else{
                return "Idoso";
            }
        } catch (NumberFormatException e){
            return "Idade inválida";
        }*/
    
    @GetMapping("{idade}")
    public String classificaIdade(@PathVariable int idade){

        if (idade > 0 && idade < 12){
            return "Criança";
        }else if(idade >= 12 && idade <=18){
            return "Adolescente";
        }else if(idade >= 19 && idade <= 60){
            return "Adulto";
        }else if(idade > 60){
            return "Idoso";
        }else{
            return "Idade inválida";
        }

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
