package com.example.demo.controles;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;




@RequestMapping("/health")
@RestController 
public class Health {

    @GetMapping
    public String getHealth() {
        return new String( "API de Introduccion Activa");
    }

    @GetMapping("/{id}")
    public String getHealthById(
        @PathVariable(name = "id") String id,
        @RequestParam(name = "param") String param
    ) {
        return "Health id: " + id + " Param: " + param;
    }
        
    
}
