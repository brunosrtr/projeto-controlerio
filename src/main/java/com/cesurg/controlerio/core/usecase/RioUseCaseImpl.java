package com.cesurg.controlerio.core.usecase;

import com.cesurg.controlerio.core.domain.interfaces.RioRepository;
import com.cesurg.controlerio.core.domain.interfaces.RioUseCase;
import com.cesurg.controlerio.core.domain.model.Rio;
import com.cesurg.controlerio.infra.repository.RioRepositoryImpl;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RioUseCaseImpl implements RioUseCase {


    private final RioRepository rioRepository;

    public RioUseCaseImpl(RioRepository rioRepository) {
        this.rioRepository = rioRepository;
    }

    @Override
    public void adicionarRio(Rio rio) {
        rioRepository.adicionarRio(rio);
    }

    @Override
    public void atualizarRio(Rio rio) {
        rioRepository.atualizarRio(rio);
    }


    @Override
    public void deletarRio(Long id) {
        rioRepository.deletarRio(id);
    }

    @Override
    public List<Rio> listarRios() {
        return rioRepository.listarRios();
    }
}
