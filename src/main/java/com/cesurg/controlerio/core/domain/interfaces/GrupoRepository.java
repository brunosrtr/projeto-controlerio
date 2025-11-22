package com.cesurg.controlerio.core.domain.interfaces;

import com.cesurg.controlerio.core.domain.model.Grupo;
import com.cesurg.controlerio.core.domain.model.Usuario;

import java.util.List;

public interface GrupoRepository {
    void criarGrupo(Grupo grupo);
    void atualizarGrupo(Grupo grupo);
    void deletarGrupo(Long id);
    List<Grupo> listarGrupo();
}
