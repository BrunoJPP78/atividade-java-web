package com.example.atividade_java_para_web.repository;

import com.example.atividade_java_para_web.model.Veiculos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VeiculosRepository extends JpaRepository<Veiculos, Integer> {

}
