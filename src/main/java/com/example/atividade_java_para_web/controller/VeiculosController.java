package com.example.atividade_java_para_web.controller;

import com.example.atividade_java_para_web.model.Veiculos;
import com.example.atividade_java_para_web.service.VeiculosService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@AllArgsConstructor
@RestController
@RequestMapping("/veiculos")
public class VeiculosController {

    private VeiculosService service;

    @GetMapping
    public List<Veiculos> listar(){
        log.info("Listando veículos");
        return service.listarVeiculos();
    }

    @GetMapping("/{id}")
    public Veiculos consultarPorId(@PathVariable Integer id){
        var veiculo = service.consultar(id);
        return veiculo;
    }

    @PostMapping
    public Veiculos inserir(@RequestBody Veiculos veiculos){
        veiculos = service.salvar(veiculos);
        return veiculos;
    }

    @PutMapping("/{id}")
    public Veiculos atualizar(@RequestBody Veiculos veiculos){
        return  service.alterar(veiculos);
    }

    @DeleteMapping("/{id}")
    public void excluirVeiculo(@PathVariable Integer id){
        service.deletar(id);
    }


}
