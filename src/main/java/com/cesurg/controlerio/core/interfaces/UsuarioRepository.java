package com.cesurg.controlerio.core.interfaces;

import com.cesurg.controlerio.core.domain.model.Usuario;

import java.util.List;

public interface UsuarioRepository {
    void criarUsuario(Usuario usuario);
    void atualizarUsuario(Usuario usuario);
    void deletarUsuario(Long id);
    List<Usuario> listarUsuario();
    Usuario buscarUsuario(Long id);
}
