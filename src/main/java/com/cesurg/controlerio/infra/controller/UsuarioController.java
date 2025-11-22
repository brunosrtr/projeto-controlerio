package com.cesurg.controlerio.infra.controller;

import com.cesurg.controlerio.core.domain.interfaces.UsuarioRepository;
import com.cesurg.controlerio.core.domain.interfaces.UsuarioUseCase;
import com.cesurg.controlerio.core.domain.model.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    @Autowired
    UsuarioUseCase usuarioUseCase;

    @PostMapping
    void criarUsuario(@RequestBody Usuario usuario) {
        usuarioUseCase.criarUsuario(usuario);
    }

    @GetMapping
    List<Usuario> listarUsuario() {
        return usuarioUseCase.listarUsuario();
    }

    @PutMapping("/{id}")
    void atualizarUsuario(@PathVariable long id, @RequestBody Usuario dados) {
        usuarioUseCase.atualizarUsuario(id, dados);
    }

    @DeleteMapping("/{id}")
    void deletarUsuario(@PathVariable Long id){
        usuarioUseCase.deletarUsuario(id);
    }



}

