package com.cesurg.controlerio.infra.controller;

import com.cesurg.controlerio.core.domain.interfaces.PermissaoRepository;
import com.cesurg.controlerio.core.domain.model.Permissao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.batch.BatchTransactionManager;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/permissao")
public class PermissaoController {
    @Autowired
    private PermissaoRepository permissaoRepository;

    @PostMapping
    public void criarPermissao(@RequestBody Permissao permissao){
        permissaoRepository.criarPermissao(permissao);
    }

    @GetMapping
    List<Permissao> listarPermissoes(){
        return permissaoRepository.listarPermissao();
    }

    @PutMapping("/{id}")
    public void atualizarPermissao(@RequestBody Permissao permissao){
        permissaoRepository.atualizarPermissoes(permissao);
    }

    @DeleteMapping("{id}")
    public void deletarPermissao(@PathVariable String id){
        permissaoRepository.deletarPermissao(id);
    }


}
