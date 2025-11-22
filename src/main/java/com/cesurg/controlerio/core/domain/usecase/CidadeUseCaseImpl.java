package com.cesurg.controlerio.core.domain.usecase;

import com.cesurg.controlerio.core.interfaces.CidadeRepository;
import com.cesurg.controlerio.core.interfaces.CidadeUseCase;
import com.cesurg.controlerio.core.domain.model.Cidade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CidadeUseCaseImpl implements CidadeUseCase {

    @Autowired
    CidadeRepository cidadeRepository;

    @Override
    public List<Cidade> listarCidade() {
        return cidadeRepository.listarCidade();
    }

    @Override
    public List<Cidade> buscarCidadePorId(Long id) {
        return cidadeRepository.buscarCidadePorId(id);
    }

    @Override
    public void criarCidade(Cidade cidade) {
        cidadeRepository.criarCidade(cidade);
    }

    @Override
    public void atualizarCidade(Cidade cidade) {
        cidadeRepository.atualizarCidade(cidade);
    }

    @Override
    public void deletarCidade(Long id) {
        cidadeRepository.deletarCidade(id);
    }
}