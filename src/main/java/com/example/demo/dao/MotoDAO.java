package com.example.demo.dao;

import com.example.demo.dao.interfaces.IMotoDAO;
import com.example.demo.dto.Moto;
import org.springframework.stereotype.Component;

@Component
public class MotoDAO implements IMotoDAO {

    @Override
    public Moto findByPatente(String patente) {
        return new Moto(patente,"Kawazaki", 600);
    }
}
