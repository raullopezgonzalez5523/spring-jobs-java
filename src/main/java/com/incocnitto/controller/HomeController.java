package com.incocnitto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Date;

@Controller
public class HomeController {

    @GetMapping("/")
    public String mostrarHome(Model model) {
        String nombre = "Auxiliar de Contabilidad";
        Date fechaPublicacion = new Date();
        Double salario = 9000.0;
        Boolean vigente = true;

        model.addAttribute("nombre", nombre);
        model.addAttribute("fechaPublicacion", fechaPublicacion);
        model.addAttribute("salario", salario);
        model.addAttribute("vigente", vigente);

        return "home";
    }

}
