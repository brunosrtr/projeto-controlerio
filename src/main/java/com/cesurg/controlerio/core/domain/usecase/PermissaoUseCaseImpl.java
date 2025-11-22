package com.cesurg.controlerio.core.domain.usecase;

import com.cesurg.controlerio.core.interfaces.PermissaoRepository;
import com.cesurg.controlerio.core.interfaces.PermissaoUseCase;
import com.cesurg.controlerio.core.domain.model.Permissao;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PermissaoUseCaseImpl implements PermissaoUseCase {

    private final PermissaoRepository permissaoRepository;

    public PermissaoUseCaseImpl (PermissaoRepository permissaoRepository) {
        this.permissaoRepository = permissaoRepository;
    }

    @Override
    public void criarPermissao(Permissao permissao) {
        permissaoRepository.criarPermissao(permissao);
    }

    @Override
    public void atualizarPermissoes(Permissao permissao) {
        permissaoRepository.atualizarPermissoes(permissao);
    }

    @Override
    public void deletarPermissao(Long id) {
        permissaoRepository.deletarPermissao(id);
    }

    @Override
    public List<Permissao> listarPermissao() {
        return permissaoRepository.listarPermissao();
    }
}
