package com.cesurg.controlerio.infra.controller;

import com.cesurg.controlerio.core.domain.interfaces.CidadeRepository;
import com.cesurg.controlerio.core.domain.model.Cidade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cidade")
public class CidadeController {

    @Autowired
    private CidadeRepository repository;

    @GetMapping
    public List<Cidade> listar() {
        return repository.listar();
    }

    @GetMapping("/{id}")
    public Cidade buscarPorId(@PathVariable int id) {
        return repository.buscarPorId(id);
    }

    @PostMapping
    public void criar(@RequestBody Cidade cidade) {
        repository.criar(cidade);
    }

    @PutMapping("/{id}")
    public void atualizar(@PathVariable int id, @RequestBody Cidade cidade) {
        cidade.setId(id);
        repository.atualizar(cidade);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable int id) {
        repository.deletar(id);
    }
}
