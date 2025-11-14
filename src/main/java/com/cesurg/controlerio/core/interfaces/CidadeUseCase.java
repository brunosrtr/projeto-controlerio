package com.cesurg.controlerio.core.interfaces;

import java.util.List;
import com.cesurg.controlerio.core.domain.model.Cidade;

public interface CidadeUseCase {
    List<Cidade> listarTodas();
    List<Cidade> buscarPorId(Long id);
    void criar(Cidade cidade);
    void atualizar(Cidade cidade);
    void deletar(Long id);
}