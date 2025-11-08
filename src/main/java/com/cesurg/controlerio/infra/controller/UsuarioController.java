package com.cesurg.controlerio.infra.controller;

import com.cesurg.controlerio.core.domain.interfaces.UsuarioRepository;
import com.cesurg.controlerio.core.domain.model.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    @Autowired
    UsuarioRepository usuarioRepository;

    @PostMapping
    void criarUsuario(@RequestBody Usuario usuario) {
        usuarioRepository.criarUsuario(usuario);
    }

    @GetMapping
    List<Usuario> listarUsuario() {
        return usuarioRepository.listarUsuario();
    }

    @PutMapping("/{id}")
    void atualizarUsuario(@RequestBody Usuario usuario) {
        usuarioRepository.atualizarUsuario(usuario);
    }

    @DeleteMapping("{id}")
    void deletarUsuario(@PathVariable String id){
        usuarioRepository.deletarUsuario(id);
    }



}

