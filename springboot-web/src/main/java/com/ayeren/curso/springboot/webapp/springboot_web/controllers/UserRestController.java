package com.ayeren.curso.springboot.webapp.springboot_web.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserRestController {


    /*
     * FORMA EQUIVALENTE A @RestController
     * Usar la anotación @Controller (Controlador) y
     * agregar @ResponseBody, ya que @RestController es equivalente a la unión
     * entre @Controller y @ResponseBody
     */

    /*
     * FORMA EQUIVALENTE A GETMAPPING
     * @RequestMapping(path="/details",method = RequestMethod.GET)
     */
    @GetMapping("/details")
    public Map<String,Object> details(){
        Map<String, Object> body = new HashMap<>();
        body.put("title", "Hola Mundo Spring Boot");
        body.put("name", "Andres");
        body.put("lastname", "Guzman");
        return body;
    }

}
