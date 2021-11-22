package com.incocnitto.controller;

import com.incocnitto.model.Vacante;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

@Controller
public class HomeController {

    @GetMapping("/tabla")
    public String mostrarTabla(Model model) {
        List<Vacante> lista = listaVacantes();
        model.addAttribute("vacantes", lista);
        return "tabla";
    }

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

    private List<Vacante> listaVacantes() {
        List<Vacante> lista = new LinkedList<>();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Vacante vacante1 = new Vacante();
            vacante1.setId(1);
            vacante1.setNombre("Ingeniero de comunicaicones");
            vacante1.setDescripcion("Se solocita ingeniero para dar soporte a intranet");
            vacante1.setFecha(simpleDateFormat.parse("01/01/2020"));
            vacante1.setSalario(9700.0);

            Vacante vacante2 = new Vacante();
            vacante2.setId(2);
            vacante2.setNombre("Ingeniero en sistemas");
            vacante2.setDescripcion("Se solocita ingeniero para dar soporte a intranet");
            vacante2.setFecha(simpleDateFormat.parse("01/02/2020"));
            vacante2.setSalario(9700.0);

            Vacante vacante3 = new Vacante();
            vacante3.setId(3);
            vacante3.setNombre("Ingeniero en redes");
            vacante3.setDescripcion("Se solocita ingeniero para dar soporte a intranet");
            vacante3.setFecha(simpleDateFormat.parse("01/03/2020"));
            vacante3.setSalario(9700.0);

            Vacante vacante4 = new Vacante();
            vacante4.setId(4);
            vacante4.setNombre("Ingeniero en servicios web");
            vacante4.setDescripcion("Se solocita ingeniero para dar soporte a intranet");
            vacante4.setFecha(simpleDateFormat.parse("01/04/2020"));
            vacante4.setSalario(9700.0);

            lista.add(vacante1);
            lista.add(vacante2);
            lista.add(vacante3);
            lista.add(vacante4);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lista;
    }

}
