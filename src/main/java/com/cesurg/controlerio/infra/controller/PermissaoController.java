package com.cesurg.controlerio.infra.controller;

import com.cesurg.controlerio.core.domain.interfaces.PermissaoRepository;
import com.cesurg.controlerio.core.domain.interfaces.PermissaoUseCase;
import com.cesurg.controlerio.core.domain.model.Permissao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.batch.BatchTransactionManager;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/permissao")
public class PermissaoController {
    @Autowired
    private PermissaoUseCase permissaoUseCase;

    @PostMapping
    public void criarPermissao(@RequestBody Permissao permissao){
        permissaoUseCase.criarPermissao(permissao);
    }

    @GetMapping
    List<Permissao> listarPermissoes(){
        return permissaoUseCase.listarPermissao();
    }

    @PutMapping("/{id}")
    public void atualizarPermissao(@RequestBody Permissao permissao){
        permissaoUseCase.atualizarPermissoes(permissao);
    }

    @DeleteMapping("/{id}")
    public void deletarPermissao(@PathVariable Long id){
        permissaoUseCase.deletarPermissao(id);
    }


}
