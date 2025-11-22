package com.cesurg.controlerio.core.interfaces;

import com.cesurg.controlerio.core.domain.model.Permissao;

import java.util.List;

public interface PermissaoRepository {
    void criarPermissao(Permissao permissao);
    void atualizarPermissoes(Permissao permissao);
    void deletarPermissao(Long id);
    List<Permissao> listarPermissao();
}
