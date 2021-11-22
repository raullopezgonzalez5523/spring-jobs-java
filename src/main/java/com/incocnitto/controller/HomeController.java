package com.incocnitto.controller;

import com.incocnitto.model.Vacante;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Date;
import java.util.List;

@Controller
public class HomeController {

    @GetMapping("/detalle")
    public String mostrarDetalle(Model model) {
        Vacante vacante = new Vacante();
        vacante.setId(1);
        vacante.setNombre("Ingeniero de comunicaicones");
        vacante.setDescripcion("Se solocita ingeniero para dar soporte a intranet");
        vacante.setFecha(new Date());
        vacante.setSalario(9700.0);

        model.addAttribute("vacante", vacante);

        return "detalle";
    }

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
