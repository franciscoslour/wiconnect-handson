package com.example.hande;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mensagens")
public class MensagemController {


    @GetMapping
    public String retornandoMensagem(){
        return "<H1>Francisco Lourenço - Teste 2</H1>";
    }

}
