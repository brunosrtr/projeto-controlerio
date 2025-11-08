package com.cesurg.controlerio.core.usecase;

import com.cesurg.controlerio.core.domain.interfaces.UsuarioRepository;
import com.cesurg.controlerio.core.domain.interfaces.UsuarioUseCase;
import com.cesurg.controlerio.core.domain.model.Usuario;
import com.cesurg.controlerio.infra.repository.UsuarioRepositoryImpl;

import java.util.List;

public class UsuarioUseCaseImpl implements UsuarioUseCase {

    private final UsuarioRepositoryImpl usuarioRepository;

    public UsuarioUseCaseImpl(UsuarioRepositoryImpl usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @Override
    public Usuario criarUsuario(Usuario usuario) {
        return usuarioRepository.criarUsuario(usuario);
    }

    @Override
    public List<Usuario> listarUsuario() {
        return usuarioRepository.listarUsuario();
    }

    @Override
    public void deletarUsuario(String id) {
        usuarioRepository.deletarUsuario(id);
    }

    @Override
    public Usuario atualizarUsuario(Usuario usuario) {
        return usuarioRepository.atualizarUsuario(usuario);
    }
}
