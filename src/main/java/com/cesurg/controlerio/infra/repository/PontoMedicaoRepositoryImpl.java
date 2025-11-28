package com.cesurg.controlerio.infra.repository;

import com.cesurg.controlerio.core.domain.model.PontoMedicao;
import com.cesurg.controlerio.core.interfaces.PontoMedicaoRepository;

import java.util.List;

public class PontoMedicaoRepositoryImpl implements PontoMedicaoRepository {
    @Override
    public List<PontoMedicao> listarPonto() {
        return List.of();
    }

    @Override
    public List<PontoMedicao> buscarPontoPorId() {
        return List.of();
    }

    @Override
    public void criarPonto() {

    }

    @Override
    public void atualizarPonto() {

    }

    @Override
    public void deletarPonto() {

    }
}
