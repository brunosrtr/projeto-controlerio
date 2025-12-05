package com.cesurg.controlerio.core.interfaces;

import com.cesurg.controlerio.core.domain.model.Medicao;

import java.time.LocalDate;
import java.util.List;

public interface MedicaoUseCase {
    void adicionarMedicao(Medicao medicao);
    void atualizarMedicao(Medicao medicao);
    void deletarMedicao(Long id);
    List<Medicao> listarMedicoes();
    List<Medicao> filtroPorDia(LocalDate dataInicio, LocalDate dataFim);
}
