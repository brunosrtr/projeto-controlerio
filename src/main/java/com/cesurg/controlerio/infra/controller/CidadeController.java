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
    private CidadeUseCase cidadeUseCase;

    @GetMapping
    public List<Cidade> listar() {
        return cidadeUseCase.listarTodas();
    }

    @GetMapping("/{id}")
    public List<Cidade> buscarPorId(@PathVariable Long id) {
        return cidadeUseCase.buscarPorId(id);
    }

    @PostMapping
    public void criar(@RequestBody Cidade cidade) {
        cidadeUseCase.criar(cidade);
    }

    @PutMapping("/{id}")
    public void atualizar(@PathVariable Long id, @RequestBody Cidade cidade) {
        cidadeUseCase.atualizar(cidade);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        cidadeUseCase.deletar(id);
    }
}
