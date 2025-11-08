package com.cesurg.controlerio.core.domain.interfaces;

import java.util.List;
import com.cesurg.controlerio.core.domain.model.Cidade;

public interface CidadeRepository {
    List<Cidade> listar();
    Cidade buscarPorId(int id);
    void criar(Cidade cidade);
    void atualizar(Cidade cidade);
    void deletar(int id);
}