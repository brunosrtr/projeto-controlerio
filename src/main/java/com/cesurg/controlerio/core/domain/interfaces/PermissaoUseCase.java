package com.cesurg.controlerio.core.domain.interfaces;

import com.cesurg.controlerio.core.domain.model.Permissao;

import java.util.List;

public interface PermissaoUseCase {
    void criarPermissao(Permissao permissao);
    void atualizarPermissoes(Permissao permissao);
    void deletarPermissao(String id);
    List<Permissao> listarPermissao();
}
