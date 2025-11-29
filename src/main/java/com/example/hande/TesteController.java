package com.example.hande;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/teste")
public class TesteController {

    @GetMapping("/mensagem")
    public String mensagem() {
        return "TESTANDOOOOOOOOOOOOOOOOO";
    }
}
