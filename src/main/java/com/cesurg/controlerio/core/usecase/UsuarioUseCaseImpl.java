package com.cesurg.controlerio.core.usecase;

import com.cesurg.controlerio.core.domain.interfaces.UsuarioRepository;
import com.cesurg.controlerio.core.domain.interfaces.UsuarioUseCase;
import com.cesurg.controlerio.core.domain.model.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioUseCaseImpl implements UsuarioUseCase {

    @Autowired
    private PasswordEncoder passwordEncoder;

    private final UsuarioRepository usuarioRepository;

    public UsuarioUseCaseImpl(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @Override
    public void criarUsuario(Usuario usuario) {

        String senhaCrua = usuario.getSenha();
        String senhaHash = passwordEncoder.encode(senhaCrua);
        usuario.setSenha(senhaHash);

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
    public void atualizarUsuario(long id, Usuario dados) {

        Usuario usuarioDoBanco = usuarioRepository.buscarUsuario(id);

        if(dados.getNome() != null && !dados.getNome().isEmpty()){
            usuarioDoBanco.setNome(dados.getNome());
        }
        if(dados.getEmail() != null && !dados.getEmail().isEmpty()){
            usuarioDoBanco.setEmail(dados.getEmail());
        }
        if(dados.getSenha() != null && !dados.getSenha().isEmpty()){

            String hashNovo = passwordEncoder.encode(dados.getSenha());
            usuarioDoBanco.setSenha(hashNovo);
        }
        usuarioRepository.atualizarUsuario(usuarioDoBanco);
    }
}
