package com.cesurg.controlerio.core.domain.interfaces;

import com.cesurg.controlerio.core.domain.model.Usuario;

import java.util.List;

public interface UsuarioUseCase {
    void criarUsuario(Usuario usuario);
    void atualizarUsuario(long id, Usuario dados);
    void deletarUsuario(Long id);
    List<Usuario> listarUsuario();
}