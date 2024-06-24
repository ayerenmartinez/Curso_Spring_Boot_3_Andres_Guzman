package com.ayeren.curso.springboot.webapp.springboot_web.controllers;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;





@Controller
public class UserController {
    
    /*
     * @GetMapping("/details")
    public String details(Model model){
        model.addAttribute("title", "Hola mundo Spring Boot");
        model.addAttribute("name", "Anthony");
        model.addAttribute("lastName", "Yeren Martinez");
        return "details"; //Devuelve la vista details
    }
     */
    @GetMapping("/details")
    public String details(Map<String, Object> model) {
        model.put("title", "Hola mundo Spring Boot");
        model.put("name", "Anthony");
        model.put("lastName", "Yeren Martinez");
        return "details";
    }
    
    

}
