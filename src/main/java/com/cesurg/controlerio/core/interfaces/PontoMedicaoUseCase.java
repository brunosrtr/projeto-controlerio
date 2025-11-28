package com.cesurg.controlerio.core.interfaces;

import com.cesurg.controlerio.core.domain.model.PontoMedicao;

import java.util.List;

public interface PontoMedicaoUseCase {
    List<PontoMedicao> listarPonto();
    List<PontoMedicao> buscarPontoPorId();
    void criarPonto();
    void atualizarPonto();
    void deletarPonto();
}
