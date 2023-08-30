package com.eventApp.eventApp.controller;

import com.eventApp.eventApp.repositories.EventoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.eventApp.eventApp.models.Evento;
import org.springframework.web.servlet.ModelAndView;

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
    @RequestMapping("/eventos")
    public ModelAndView listaEventos(){
        ModelAndView mv = new ModelAndView("index");
        Iterable<Evento> eventos = er.findAll();
        mv.addObject("eventos", eventos);
        return mv;
    }





    //Envio de requisicoes com objetos
    @PostMapping(value = "/cadastrarEventoV2")
    public ResponseEntity<Object> formV2(@RequestBody Evento evento ){
        return ResponseEntity.ok(er.save(evento));
    }

    @RequestMapping(value ="/eventosV2")
    public ResponseEntity<Object> listaEventosV2(){
        return ResponseEntity.ok(er.findAll());
    }

    @GetMapping(value = "/{codigo}")
    public ResponseEntity<Object> detalhesEvento(@PathVariable("codigo") long codigo){
        return ResponseEntity.ok(er.findByCodigo(codigo));
    }



}
