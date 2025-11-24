package com.cesurg.controlerio.infra.repository;

import com.cesurg.controlerio.core.domain.model.GrupoPermissao;
import com.cesurg.controlerio.core.interfaces.GrupoPermissaoRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class GrupoPermissaoRepositoryImpl implements GrupoPermissaoRepository {

    @PersistenceContext
    EntityManager entityManager;

    @Transactional
    @Override
    public void criar(GrupoPermissao grupoPermissao) {
        String sql = "INSERT INTO grupo_permissao (id_grupo, id_permissao) VALUES (:1, :2)";

        entityManager.createNativeQuery(sql)
            .setParameter(1, grupoPermissao.getGrupo().getId())
            .setParameter(2, grupoPermissao.getPermissao().getId())
            .executeUpdate();
    }

    @Transactional
    @Override
    public void atualizar(GrupoPermissao grupoPermissao) {
        String sql = "UPDATE grupo_permissao SET id_grupo = :1, id_permissao = :2 WHERE id = :3";

        entityManager.createNativeQuery(sql)
                .setParameter(1, grupoPermissao.getGrupo().getId())
                .setParameter(2, grupoPermissao.getPermissao().getId())
                .executeUpdate();
    }

    @Transactional
    @Override
    public void deletar(Long id) {
        String sql = "DELETE FROM grupo WHERE ID = :id";
        entityManager.createNativeQuery(sql)
                .setParameter("id", id)
                .executeUpdate();
    }

    @Override
    public List<GrupoPermissao> listarGrupoPermissao() {
        String sql = "SELECT * FROM grupo_permissao";
        return entityManager.createNativeQuery(sql, GrupoPermissao.class).getResultList();
    }
}
