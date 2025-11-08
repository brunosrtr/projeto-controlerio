package com.cesurg.controlerio.core.usecase;

import com.cesurg.controlerio.core.domain.interfaces.RioUseCase;
import com.cesurg.controlerio.core.domain.model.Rio;
import com.cesurg.controlerio.infra.repository.RioRepositoryImpl;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RioUseCaseImpl implements RioUseCase {


    private final RioRepositoryImpl rioRepository;

    public RioUseCaseImpl(RioRepositoryImpl rioRepository) {
        this.rioRepository = rioRepository;
    }

    @Override
    public void adicionarRio(Rio rio) {
        rioRepository.adicionarRio(rio);
    }

    @Override
    public void deletarRio(String id) {
        rioRepository.deletarRio(id);
    }

    @Override
    public List<Rio> listarRios() {
        return rioRepository.listarRios();
    }
}
