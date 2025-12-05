package com.cesurg.controlerio.core.interfaces;

import com.cesurg.controlerio.core.domain.model.Medicao;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public interface MedicaoRepository {
    void adicionarMedicao(Medicao medicao);
    void atualizarMedicao(Medicao medicao);
    void deletarMedicao(Long id);
    List<Medicao> listarMedicoes();
    List<Medicao> filtroPorDia(LocalDateTime dataInicio, LocalDateTime dataFim);
}
