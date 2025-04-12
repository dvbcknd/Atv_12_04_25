package com.Projeto_Raq.sistemax.controllers;

import com.Projeto_Raq.sistemax.repositories.EventoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EventoControllers {

    @Autowired
    private EventoRepository eventoRepository;

    @GetMapping("/")
    public String listarEventos(Model model) {
        model.addAttribute("eventos", eventoRepository.findAll());
        return "index";
    }
}

