package com.cesurg.controlerio.infra.controller;

import com.cesurg.controlerio.core.domain.interfaces.GrupoRepository;
import com.cesurg.controlerio.core.domain.model.Grupo;
import com.cesurg.controlerio.core.domain.model.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/grupos")
public class GrupoController {

    @Autowired
    private GrupoRepository grupoRepository;

    @PostMapping("/criar")
    public Grupo criar(@RequestBody Grupo grupo) {
        return grupoRepository.criarGrupo(grupo);
    }

    @GetMapping("/listar")
    List<Usuario> listar() {
        return grupoRepository.listarGrupo();
    }

    @PutMapping
    void atualizar(@RequestBody Grupo grupo) {
        grupoRepository.atualizarGrupo(grupo);
    }

    @DeleteMapping("{id}")
    void deletar(@PathVariable String id){
        grupoRepository.deletarGrupo(id);
    }
}
