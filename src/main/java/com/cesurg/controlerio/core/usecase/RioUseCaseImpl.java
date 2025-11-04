package com.cesurg.controlerio.core.usecase;

import com.cesurg.controlerio.core.domain.interfaces.RioUseCase;
import com.cesurg.controlerio.core.domain.model.Rio;
import com.cesurg.controlerio.infra.repository.RioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RioUseCaseImpl implements RioUseCase {


    private final RioRepository rioRepository;

    public RioUseCaseImpl(RioRepository rioRepository) {
        this.rioRepository = rioRepository;
    }

    @Override
    public Rio adicionarRio(Rio rio) {
        return rioRepository.save(rio);
    }

    @Override
    public void deletarRio(String id) {
        rioRepository.deleteById(id);
    }

    @Override
    public List<Rio> listarRios() {
        return rioRepository.findAll();
    }
}
