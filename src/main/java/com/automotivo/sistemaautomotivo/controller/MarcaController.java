package com.automotivo.sistemaautomotivo.controller;


import com.automotivo.sistemaautomotivo.model.Marca;
import com.automotivo.sistemaautomotivo.repository.MarcaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/marca")
public class MarcaController {

    @Autowired
    private MarcaRepository marcaRepository;

    @PostMapping
    public Marca cadastrar(@RequestBody Marca marca) {
        return marcaRepository.save(marca);
    }

    @GetMapping
    public List<Marca> listar() {
        return marcaRepository.findAll();
    }
}
