package com.cesurg.controlerio.core.usecase;

import com.cesurg.controlerio.core.domain.interfaces.MedicaoUseCase;
import com.cesurg.controlerio.core.domain.model.Medicao;
import com.cesurg.controlerio.infra.repository.MedicaoRepositoryImpl;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class MedicaoUseCaseImpl implements MedicaoUseCase {

    private final MedicaoRepositoryImpl medicaoRepository;

    public MedicaoUseCaseImpl(MedicaoRepositoryImpl medicaoRepository) {
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
    public void deletarMedicao(String id) {
        medicaoRepository.deletarMedicao(id);
    }

    @Override
    public List<Medicao> listarMedicoes() {
        return medicaoRepository.listarMedicoes();
    }


}
