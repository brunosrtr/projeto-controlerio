package com.cesurg.controlerio.core.usecase;

import com.cesurg.controlerio.core.domain.interfaces.CidadeRepository;
import com.cesurg.controlerio.core.domain.interfaces.CidadeUseCase;
import com.cesurg.controlerio.core.domain.model.Cidade;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CidadeUseCaseImpl implements CidadeUseCase {

    private final CidadeRepository cidadeRepository;

    public CidadeUseCaseImpl(CidadeRepository cidadeRepository) {
        this.cidadeRepository = cidadeRepository;
    }

    @Override
    public List<Cidade> listarTodas() {
        return cidadeRepository.listar();
    }

    @Override
    public Cidade buscarPorId(int id) {
        return cidadeRepository.buscarPorId(id);
    }

    @Override
    public void criar(Cidade cidade) {
        cidadeRepository.criar(cidade);
    }

    @Override
    public void atualizar(Cidade cidade) {
        cidadeRepository.atualizar(cidade);
    }

    @Override
    public void deletar(int id) {
        cidadeRepository.deletar(id);
    }
}