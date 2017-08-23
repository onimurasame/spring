package com.example.demo.controllers;


import com.example.demo.dao.interfaces.IMotoDAO;
import com.example.demo.dto.Moto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/moto")
public class MotosController {

    @Autowired
    private IMotoDAO motoDAO;

    @RequestMapping(value = "/{patente}", method = RequestMethod.GET)
    public Moto getMoto(@PathVariable String patente){
        return motoDAO.findByPatente(patente);
    }

}
