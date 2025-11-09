package com.cesurg.controlerio.core.domain.interfaces;

import com.cesurg.controlerio.core.domain.model.Medicao;

import java.util.List;

public interface MedicaoUseCase {
    void adicionarMedicao(Medicao medicao);
    void atualizarMedicao(Medicao medicao);
    void deletarMedicao(Long id);
    List<Medicao> listarMedicoes();
}
