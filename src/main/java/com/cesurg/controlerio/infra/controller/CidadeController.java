package com.cesurg.controlerio.infra.controller;

import com.cesurg.controlerio.core.interfaces.CidadeUseCase;
import com.cesurg.controlerio.core.domain.model.Cidade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cidade")
public class CidadeController {

    @Autowired
    CidadeUseCase cidadeUseCase;

    @GetMapping
    public List<Cidade> listarCidade() {
        return cidadeUseCase.listarCidade();
    }

    @GetMapping("/{id}")
    public List<Cidade> buscarCidadePorId(@PathVariable Long id) {
        return cidadeUseCase.buscarCidadePorId(id);
    }

    @PostMapping
    public void criarCidade(@RequestBody Cidade cidade) {
        cidadeUseCase.criarCidade(cidade);
    }

    @PutMapping("/{id}")
    public void atualizarCidade(@PathVariable Long id, @RequestBody Cidade cidade) {
        cidadeUseCase.atualizarCidade(cidade);
    }

    @DeleteMapping("/{id}")
    public void deletarCidade(@PathVariable Long id) {
        cidadeUseCase.deletarCidade(id);
    }
}
