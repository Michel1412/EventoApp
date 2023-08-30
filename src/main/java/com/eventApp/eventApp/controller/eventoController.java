package com.eventApp.eventApp.controller;

import com.eventApp.eventApp.repositories.EventoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.eventApp.eventApp.models.Evento;

@Controller
public class eventoController {


    @Autowired
    private EventoRepository er;

    @RequestMapping(value = "/cadastrarEvento", method= RequestMethod.GET)
    public String form(){

        return "evento/formEvent";
    }

    @RequestMapping(value = "/cadastrarEvento", method= RequestMethod.POST)
    public String form(Evento evento ){

        er.save(evento);

        return "redirect:/cadastrarEvento";
    }
}
