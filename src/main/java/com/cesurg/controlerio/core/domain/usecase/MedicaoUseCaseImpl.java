package com.cesurg.controlerio.core.domain.usecase;

import com.cesurg.controlerio.core.interfaces.MedicaoRepository;
import com.cesurg.controlerio.core.interfaces.MedicaoUseCase;
import com.cesurg.controlerio.core.domain.model.Medicao;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;


@Service
public class MedicaoUseCaseImpl implements MedicaoUseCase {

    private final MedicaoRepository medicaoRepository;

    public MedicaoUseCaseImpl(MedicaoRepository medicaoRepository) {
        this.medicaoRepository = medicaoRepository;
    }

    @Override
    public void adicionarMedicao(Medicao medicao) {
        medicaoRepository.adicionarMedicao(medicao);
    }

    @Override
    public void atualizarMedicao(Medicao medicao) {
        medicaoRepository.atualizarMedicao(medicao);
    }


    @Override
    public void deletarMedicao(Long id) {
        medicaoRepository.deletarMedicao(id);
    }

    @Override
    public List<Medicao> listarMedicoes() {
        return medicaoRepository.listarMedicoes();
    }

    @Override
    public List<Medicao> filtroPorDia(LocalDate dataInicio, LocalDate dataFim) {

        LocalDateTime inicio = dataInicio.atStartOfDay();
        LocalDateTime fim = dataFim.atTime(LocalTime.MAX);

        return medicaoRepository.filtroPorDia(inicio, fim);
    }
}
