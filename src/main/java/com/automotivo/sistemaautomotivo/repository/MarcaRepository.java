package com.automotivo.sistemaautomotivo.repository;

import com.automotivo.sistemaautomotivo.model.Marca;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MarcaRepository extends JpaRepository<Marca, Long> {
}
