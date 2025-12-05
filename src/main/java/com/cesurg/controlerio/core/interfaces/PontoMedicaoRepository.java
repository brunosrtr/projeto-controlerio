package com.cesurg.controlerio.core.interfaces;

import com.cesurg.controlerio.core.domain.model.PontoMedicao;
import jakarta.transaction.Transactional;

import java.util.List;

public interface PontoMedicaoRepository {
    List<PontoMedicao> listarPonto();
    List<PontoMedicao> buscarPontoPorId(Long id);
    void criarPonto(PontoMedicao pontoMedicao);

    void atualizarPonto(PontoMedicao pontoMedicao);
    void deletarPonto(Long id);
}
