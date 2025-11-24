package com.cesurg.controlerio.core.interfaces;

import com.cesurg.controlerio.core.domain.model.GrupoPermissao;

import java.util.List;

public interface GrupoPermissaoRepository {

        void criarGrupoPermissao(GrupoPermissao grupoPermissao);
        void atualizarGrupoPermissao(GrupoPermissao grupoPermissao);
        void deletarGrupoPermissao(Long id);
        List<GrupoPermissao> listarGrupoPermissao();
}