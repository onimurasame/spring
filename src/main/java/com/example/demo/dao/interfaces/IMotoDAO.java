package com.example.demo.dao.interfaces;

import com.example.demo.dto.Moto;

public interface IMotoDAO {

    Moto findByPatente(String patente);

}
