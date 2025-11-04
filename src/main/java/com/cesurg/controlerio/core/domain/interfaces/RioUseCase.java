package com.cesurg.controlerio.core.domain.interfaces;

import com.cesurg.controlerio.core.domain.model.Medicao;
import com.cesurg.controlerio.core.domain.model.Rio;

import java.util.List;

public interface RioUseCase {
    Rio adicionarRio(Rio rio);
    void deletarRio(String id);
    List<Rio> listarRios();
}
