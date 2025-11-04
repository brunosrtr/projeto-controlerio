package com.cesurg.controlerio.core.usecase;

import com.cesurg.controlerio.core.domain.interfaces.MedicaoUseCase;
import com.cesurg.controlerio.core.domain.model.Medicao;
import com.cesurg.controlerio.infra.repository.MedicaoRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class MedicaoUseCaseImpl implements MedicaoUseCase {

    private final MedicaoRepository medicaoRepository;

    public MedicaoUseCaseImpl(MedicaoRepository medicaoRepository) {
        this.medicaoRepository = medicaoRepository;
    }

    @Override
    public Medicao adicionarMedicao(Medicao medicao) {
        return medicaoRepository.save(medicao);
    }

    @Override
    public void deletarMedicao(String id) {
        medicaoRepository.deleteById(id);
    }

    @Override
    public List<Medicao> listarMedicoes() {
        return medicaoRepository.findAll();
    }


}
