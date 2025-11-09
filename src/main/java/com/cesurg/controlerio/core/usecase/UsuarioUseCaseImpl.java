package com.cesurg.controlerio.core.usecase;

import com.cesurg.controlerio.core.domain.interfaces.UsuarioRepository;
import com.cesurg.controlerio.core.domain.interfaces.UsuarioUseCase;
import com.cesurg.controlerio.core.domain.model.Usuario;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioUseCaseImpl implements UsuarioUseCase {

    private final UsuarioRepository usuarioRepository;

    public UsuarioUseCaseImpl(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @Override
    public void criarUsuario(Usuario usuario) {
        usuarioRepository.criarUsuario(usuario);
    }

    @Override
    public List<Usuario> listarUsuario() {
        return usuarioRepository.listarUsuario();
    }

    @Override
    public void deletarUsuario(Long id) {
        usuarioRepository.deletarUsuario(id);
    }

    @Override
    public void atualizarUsuario(Usuario usuario) {
        usuarioRepository.atualizarUsuario(usuario);
    }
}
