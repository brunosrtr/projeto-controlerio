package com.cesurg.controlerio.core.domain.interfaces;

import com.cesurg.controlerio.core.domain.model.Grupo;
import com.cesurg.controlerio.core.domain.model.Usuario;

import java.util.List;

public interface GrupoUseCase {
    Grupo criarGrupo(Grupo grupo);
    List<Usuario> listarGrupo();
    void deletarGrupo(String id);
    Grupo atualizarGrupo(Grupo grupo);
}
