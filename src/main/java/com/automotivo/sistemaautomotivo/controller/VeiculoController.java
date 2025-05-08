package com.automotivo.sistemaautomotivo.controller;

import com.automotivo.sistemaautomotivo.model.Veiculo;
import com.automotivo.sistemaautomotivo.service.VeiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/veiculos")
public class VeiculoController {

    @Autowired
    private VeiculoService veiculoService;

    @PostMapping
    public Veiculo cadastrarVeiculo(@RequestBody Veiculo veiculo) {
        return veiculoService.cadastrarVeiculo(veiculo);
    }

    @GetMapping
    public List<Veiculo> listarVeiculos() {
        return veiculoService.listarVeiculos();
    }

    @GetMapping("/{id}")
    public Optional<Veiculo> buscarVeiculoPorId(@PathVariable Long id) {
        return veiculoService.buscarVeiculoPorId(id);
    }

    @PutMapping("/{id}")
    public Veiculo atualizaVeiculo(@PathVariable Long id, @RequestBody Veiculo veiculo) {
        return veiculoService.atualizarVeiculo(id, veiculo);
    }

    @DeleteMapping("/{id}")
    public void deletarVeiculo(@PathVariable Long id) {
        veiculoService.removerVeiculo(id);
    }





}
