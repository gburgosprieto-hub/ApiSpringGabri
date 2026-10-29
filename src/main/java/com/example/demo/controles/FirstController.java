package com.example.demo.controles;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/first")
public class FirstController {

    private String nameStored;

    @PostMapping
    public void crearRecurso(@RequestParam(name = "name") String name) {
        nameStored = name;
    }

    @GetMapping
    public String obtenerRecurso() {
        return "Hola " + nameStored;
    }

    @PutMapping
    public String actualizarRecurso(@RequestParam(name = "name") String name) {
        nameStored = name;
        return "Hola " + name;
    }

    @DeleteMapping
    public void borrarRecurso(@RequestParam(name = "name") String name) {
        nameStored = null;
    }
}
