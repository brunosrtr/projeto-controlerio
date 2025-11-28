package com.cesurg.controlerio.core.domain.usecase;

import com.cesurg.controlerio.core.domain.model.PontoMedicao;
import com.cesurg.controlerio.core.interfaces.PontoMedicaoRepository;
import com.cesurg.controlerio.core.interfaces.PontoMedicaoUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PontoMedicaoUseCaseImpl implements PontoMedicaoUseCase {

    @Autowired
    PontoMedicaoRepository pontoMedicaoRepository;

    @Override
    public List<PontoMedicao> listarPonto() {  return pontoMedicaoRepository.listarPonto(); }

    @Override
    public List<PontoMedicao> buscarPontoPorId(Long id) {
        return pontoMedicaoRepository.buscarPontoPorId(id);
    }

    @Override
    public void criarPonto(PontoMedicao pontoMedicao) { pontoMedicaoRepository.criarPonto(pontoMedicao); }

    @Override
    public void atualizarPonto(PontoMedicao pontoMedicao) {
        pontoMedicaoRepository.atualizarPonto(pontoMedicao);
    }

    @Override
    public void deletarPonto(Long id) { pontoMedicaoRepository.deletarPonto(id); }
}
