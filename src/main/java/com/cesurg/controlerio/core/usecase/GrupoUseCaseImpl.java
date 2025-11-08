package com.cesurg.controlerio.core.usecase;

import com.cesurg.controlerio.core.domain.interfaces.GrupoUseCase;
import com.cesurg.controlerio.core.domain.model.Grupo;
import com.cesurg.controlerio.infra.repository.GrupoRepositoryImpl;

import java.util.List;

public class GrupoUseCaseImpl implements GrupoUseCase {

    GrupoRepositoryImpl grupoRepository;

    public GrupoUseCaseImpl(GrupoRepositoryImpl grupoRepository) {
        this.grupoRepository = grupoRepository;
    }

    @Override
    public void criarGrupo(Grupo grupo) {
        grupoRepository.criarGrupo(grupo);
    }

    @Override
    public void atualizarGrupo(Grupo grupo) {
        grupoRepository.atualizarGrupo(grupo);
    }

    @Override
    public void deletarGrupo(String id) {
        grupoRepository.deletarGrupo(id);
    }

    @Override
    public List<Grupo> listarGrupo() {
        return grupoRepository.listarGrupo();
    }
}
