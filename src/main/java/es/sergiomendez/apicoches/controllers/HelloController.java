package es.sergiomendez.apicoches.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Controlador de la página de inicio
 */
@Controller
public class HelloController {

    @GetMapping("/")
    public String hola() {
        return "index.html";
    }
}
