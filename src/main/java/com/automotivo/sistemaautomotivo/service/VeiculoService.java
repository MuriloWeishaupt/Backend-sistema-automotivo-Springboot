package com.automotivo.sistemaautomotivo.service;

import com.automotivo.sistemaautomotivo.model.Veiculo;
import com.automotivo.sistemaautomotivo.repository.VeiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class VeiculoService {

    @Autowired
    private VeiculoRepository veiculoRepository;

    public Veiculo cadastrarVeiculo(Veiculo veiculo) {
        return veiculoRepository.save(veiculo);
    }

    public List<Veiculo> listarVeiculos() {
        return veiculoRepository.findAll();
    }

    public Optional<Veiculo> buscarVeiculoPorId(Long id) {
        return veiculoRepository.findById(id);
    }

    public Veiculo atualizarVeiculo(Long id, Veiculo veiculo) {
        if (veiculoRepository.existsById(id)) {
            veiculo.setId(id);
            return veiculoRepository.save(veiculo);
        } else {
           throw new RuntimeException("Veículo com id " + id + " não encontrado.");
        }
    }

    public void removerVeiculo(Long id) {
        veiculoRepository.deleteById(id);
    }

}
