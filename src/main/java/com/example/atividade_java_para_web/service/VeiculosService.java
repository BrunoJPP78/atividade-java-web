package com.example.atividade_java_para_web.service;

import com.example.atividade_java_para_web.model.Veiculos;
import com.example.atividade_java_para_web.repository.VeiculosRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Objects;

@Service
@RequiredArgsConstructor
@Slf4j
public class VeiculosService {
    private final VeiculosRepository repository;

    public List<Veiculos> listarVeiculos(){
        return repository.findAll();
    }

    public Veiculos salvar(Veiculos veiculos){
        var veiculo = repository.save(veiculos);
        return veiculo;
    }

    public Veiculos consultar(Integer id){
        validarExistenciaId(id);
        var veiculoConsultado = repository.findById(id).get();
        return veiculoConsultado;
    }

    public Veiculos alterar(Veiculos veiculos){
        validarExistenciaId(veiculos.getId());
        var veiculo  = repository.save(veiculos);
        return veiculo;
    }

    public void deletar(@PathVariable Integer id){
        log.info("Início - Excluindo usuário id {}", id);
        repository.deleteById(id);
        log.info("Fim - Excluindo usuário id {}", id);
    }

    private void validarExistenciaId(Integer id){
        if(Objects.isNull(id) || !repository.existsById(id)){ // O duplo pipe é o "Ou" ||
            log.info("Não existe!");
        }
    }

}
