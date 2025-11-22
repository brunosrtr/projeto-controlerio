package com.cesurg.controlerio.core.interfaces;

import java.util.List;
import com.cesurg.controlerio.core.domain.model.Cidade;


public interface CidadeUseCase {
    List<Cidade> listarCidade();
    List<Cidade> buscarCidadePorId(Long id);
    void criarCidade(Cidade cidade);
    void atualizarCidade(Cidade cidade);
    void deletarCidade(Long id);
}