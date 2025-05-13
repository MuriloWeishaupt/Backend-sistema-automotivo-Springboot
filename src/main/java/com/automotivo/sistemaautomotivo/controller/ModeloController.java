package com.automotivo.sistemaautomotivo.controller;


import com.automotivo.sistemaautomotivo.model.Modelo;
import com.automotivo.sistemaautomotivo.repository.ModeloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/modelos")
public class ModeloController {

    @Autowired
    private ModeloRepository modeloRepository;

    @PostMapping
    public Modelo cadastrar(@RequestBody Modelo modelo) {
        return modeloRepository.save(modelo);
    }

    @GetMapping("/marca/{marcaId}")
    public ResponseEntity<?> listarPorMarca(@PathVariable Long marcaId) {
        try {
            List<Modelo> modelos = modeloRepository.findByMarcaId(marcaId);
            if(modelos.isEmpty()) {
                return ResponseEntity.status(HttpStatus.NOT_FOUND)
                        .body("Nenhum modelo encontrado para a marca ID: " + marcaId);
            }
            return ResponseEntity.ok(modelos);
        } catch (Exception e) {
            return ResponseEntity.internalServerError()
                    .body("Erro ao buscar modelos: " + e.getMessage());
        }
    }


}
