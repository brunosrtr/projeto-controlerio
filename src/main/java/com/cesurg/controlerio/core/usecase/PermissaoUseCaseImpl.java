package com.cesurg.controlerio.core.usecase;

import com.cesurg.controlerio.core.domain.interfaces.PermissaoUseCase;
import com.cesurg.controlerio.core.domain.model.Permissao;
import com.cesurg.controlerio.infra.repository.PermissaoRepositoryImpl;

import java.util.List;

public class PermissaoUseCaseImpl implements PermissaoUseCase {

    private final PermissaoRepositoryImpl permissaoRepository;

    public PermissaoUseCaseImpl(PermissaoRepositoryImpl permissaoRepository) {
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
    public void deletarPermissao(String id) {
        permissaoRepository.deletarPermissao(id);
    }

    @Override
    public List<Permissao> listarPermissao() {
        return permissaoRepository.listarPermissao();
    }
}
