package com.cesurg.controlerio.core.usecase;

import com.cesurg.controlerio.core.domain.interfaces.GrupoRepository;
import com.cesurg.controlerio.core.domain.interfaces.GrupoUseCase;
import com.cesurg.controlerio.core.domain.model.Grupo;
import com.cesurg.controlerio.infra.repository.GrupoRepositoryImpl;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GrupoUseCaseImpl implements GrupoUseCase {

    private final GrupoRepository grupoRepository;

    public GrupoUseCaseImpl(GrupoRepository grupoRepository) {
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
    public void deletarGrupo(Long id) {
        grupoRepository.deletarGrupo(id);
    }

    @Override
    public List<Grupo> listarGrupo() {
        return grupoRepository.listarGrupo();
    }
}
