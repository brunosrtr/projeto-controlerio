package com.cesurg.controlerio.core.domain.usecase;

import com.cesurg.controlerio.core.domain.model.PontoMedicao;
import com.cesurg.controlerio.core.interfaces.PontoMedicaoRepository;
import com.cesurg.controlerio.core.interfaces.PontoMedicaoUseCase;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class PontoMedicaoUseCaseImpl implements PontoMedicaoUseCase {

    @Autowired
    PontoMedicaoRepository pontoMedicaoRepository;

    @Override
    public List<PontoMedicao> listarPonto() {  return pontoMedicaoRepository.listarPonto(); }

    @Override
    public List<PontoMedicao> buscarPontoPorId() {
        return List.of();
    }

    @Override
    public void criarPonto() {

    }

    @Override
    public void atualizarPonto() {

    }

    @Override
    public void deletarPonto() {

    }
}
