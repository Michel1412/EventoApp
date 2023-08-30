package com.eventApp.eventApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping("/teste")
    public String index(){
        return "index";
    }

}
