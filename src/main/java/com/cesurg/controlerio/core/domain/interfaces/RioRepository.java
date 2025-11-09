package com.cesurg.controlerio.core.domain.interfaces;

import com.cesurg.controlerio.core.domain.model.Rio;

import java.util.List;

public interface RioRepository {
    void adicionarRio(Rio rio);
    void atualizarRio(Rio rio);
    void deletarRio(Long id);
    List<Rio> listarRios();
}
