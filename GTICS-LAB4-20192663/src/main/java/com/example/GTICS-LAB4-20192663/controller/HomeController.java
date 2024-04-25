<<<<<<< HEAD
package com.example.demo.controller;
=======
package com.example.GTICS-LAB4-20192663.controller;
>>>>>>> P1

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

<<<<<<< HEAD
    @GetMapping("/patito")
    public String formularioPatito(Model model){
        Patito patito3 = new Patito();
        model.addAttribute("patito", patito3);
        return "formulario1";
    }

    // @GetMapping("/persona2")
    //public String formularioPersona (Model model){
    //    Persona persona3 = new Persona();
    //    model.addAttribute("persona", persona3);
    //    return "formulario";
=======
    @GetMapping("/RecursosHumanos–GTICS")
    public String Ver_Paciente() {
        return "Recursos_Humanos_GTICS";
    }


>>>>>>> P1
    }





