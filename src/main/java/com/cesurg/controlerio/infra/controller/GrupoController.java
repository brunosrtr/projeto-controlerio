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

    @PostMapping
    public void criarGrupo (@RequestBody Grupo grupo) {
        grupoRepository.criarGrupo(grupo);
    }

    @GetMapping
    List<Grupo> listarGrupo() {
        return grupoRepository.listarGrupo();
    }

    @PutMapping("/{id}")
    void atualizarGrupo (@RequestBody Grupo grupo) {
        grupoRepository.atualizarGrupo(grupo);
    }

    @DeleteMapping("{id}")
    void deletarGrupo (@PathVariable String id){
        grupoRepository.deletarGrupo(id);
    }
}
