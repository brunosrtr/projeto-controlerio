package com.cesurg.controlerio.core.interfaces;

import java.util.List;
import com.cesurg.controlerio.core.domain.model.Cidade;

public interface CidadeRepository {
    List<Cidade> listar();
    List<Cidade> buscarPorId(Long id);
    void criar(Cidade cidade);
    void atualizar(Cidade cidade);
    void deletar(Long id);
}