package com.incocnitto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Date;
import java.util.List;

@Controller
public class HomeController {

    @GetMapping("/listado")
    public String mostrarListado(Model model) {
        List<String> lista = List.of("Auxiliar de Contabilidad",
                "Auxiliar de Administración",
                "Auxiliar de Ventas",
                "Auxiliar de Producción",
                "Auxiliar de Calidad",
                "Ingeniero",
                "Arquitecto");
        model.addAttribute("empleos", lista);
        return "listado";
    }

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
