package com.cesurg.controlerio.core.domain.interfaces;

import com.cesurg.controlerio.core.domain.model.Usuario;

import java.util.List;

public interface UsuarioUseCase {
    Usuario criarUsuario(Usuario usuario);
    List<Usuario> listarUsuario();
    void deletarUsuario(String id);
    Usuario atualizarUsuario(Usuario usuario);
}