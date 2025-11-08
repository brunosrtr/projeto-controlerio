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
    Usuario criar(@RequestBody Usuario usuario) {
        return usuarioRepository.criarUsuario(usuario);
    }

    @GetMapping
    List<Usuario> listar() {
        return usuarioRepository.listarUsuario();
    }

    @PutMapping
    void atualizar(@RequestBody Usuario usuario) {
        usuarioRepository.atualizarUsuario(usuario);
    }

    @DeleteMapping("{id}")
    void deletar(@PathVariable String id){
        usuarioRepository.deletarUsuario(id);
    }



}

