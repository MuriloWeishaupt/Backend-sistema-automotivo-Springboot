package com.automotivo.sistemaautomotivo.repository;

import com.automotivo.sistemaautomotivo.model.Veiculo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface VeiculoRepository extends JpaRepository<Veiculo, Long> {
    @Query("SELECT v FROM Veiculo v " +
            "WHERE (:ano IS NULL OR v.ano = :ano) " +
            "AND (:precoMax IS NULL OR v.preco <= :precoMax) " +
            "AND (:status IS NULL OR v.statusDisponibilidade = :status)")
    List<Veiculo> filtrarVeiculos(
            @Param("marca") String marca,
            @Param("modelo") String modelo,
            @Param("placa") String placa,
            @Param("ano") Integer ano,
            @Param("precoMax") Double precoMax,
            @Param("status") String status
    );


}
