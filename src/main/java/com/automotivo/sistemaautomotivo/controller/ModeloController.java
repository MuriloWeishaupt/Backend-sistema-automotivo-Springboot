package com.automotivo.sistemaautomotivo.controller;


import com.automotivo.sistemaautomotivo.model.Modelo;
import com.automotivo.sistemaautomotivo.repository.ModeloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("modelos")
public class ModeloController {

    @Autowired
    private ModeloRepository modeloRepository;

    @PostMapping
    public Modelo cadastrar(@RequestBody Modelo modelo) {
        return modeloRepository.save(modelo);
    }
    
    @GetMapping
    public List<Modelo> listar() {
        return modeloRepository.findAll();
    }
}
