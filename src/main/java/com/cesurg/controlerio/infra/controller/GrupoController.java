package com.cesurg.controlerio.infra.controller;

import com.cesurg.controlerio.core.domain.interfaces.GrupoRepository;
import com.cesurg.controlerio.core.domain.interfaces.GrupoUseCase;
import com.cesurg.controlerio.core.domain.model.Grupo;
import com.cesurg.controlerio.core.domain.model.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/grupos")
public class GrupoController {

    @Autowired
    private GrupoUseCase grupoUseCase;

    @PostMapping
    public void criarGrupo (@RequestBody Grupo grupo) {
        grupoUseCase.criarGrupo(grupo);
    }

    @GetMapping
    List<Grupo> listarGrupo() {
        return grupoUseCase.listarGrupo();
    }

    @PutMapping
    void atualizarGrupo (@RequestBody Grupo grupo) {
        grupoUseCase.atualizarGrupo(grupo);
    }

    @DeleteMapping("/{id}")
    void deletarGrupo (@PathVariable Long id){
        grupoUseCase.deletarGrupo(id);
    }
}
