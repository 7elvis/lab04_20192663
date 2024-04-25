package com.example.GTICS-LAB4-20192663.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;

import java.util.ArrayList;

@Controller
public class HomeController {
    @RequestMapping(value = {"/holaMundo"}, method = RequestMethod.GET)
    public String holaMundo (){
        return "hola";
    }

    @GetMapping("/RecursosHumanos–GTICS")
    public String Ver_Paciente() {
        return "Recursos_Humanos_GTICS";
    }


    }





