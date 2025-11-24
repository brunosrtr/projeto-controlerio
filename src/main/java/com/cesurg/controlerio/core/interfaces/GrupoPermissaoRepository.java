package com.cesurg.controlerio.core.interfaces;

import com.cesurg.controlerio.core.domain.model.GrupoPermissao;

import java.util.List;

public interface GrupoPermissaoRepository {

        void criar(GrupoPermissao grupoPermissao);
        void atualizar(GrupoPermissao grupoPermissao);
        void deletar(Long id);
        List<GrupoPermissao> listarGrupoPermissao();
}