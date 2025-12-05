package com.cesurg.controlerio.infra.repository;


import com.cesurg.controlerio.core.interfaces.GrupoRepository;
import com.cesurg.controlerio.core.domain.model.Grupo;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class GrupoRepositoryImpl implements GrupoRepository {

    @PersistenceContext
    EntityManager entityManager;

    @Transactional
    @Override
    public void criarGrupo(Grupo grupo) {
        String sql = "INSERT INTO grupo (nome) VALUES (:nome)";
        Number id = (Number) entityManager.createNativeQuery(sql)
                .setParameter("nome", grupo.getNome())
                .getSingleResult();
        grupo.setId(id.longValue());
    }

    @Transactional
    @Override
    public void atualizarGrupo(Grupo grupo) {
        String sql = "UPDATE grupo SET nome = :nome WHERE id = :id";
        entityManager.createNativeQuery(sql)
                .setParameter("nome", grupo.getNome())
                .setParameter("id", grupo.getId())
                .executeUpdate();
    }

    @Transactional
    @Override
    public void deletarGrupo(Long id) {
        String sql = "DELETE FROM grupo WHERE ID = :id";
        entityManager.createNativeQuery(sql)
                .setParameter("id", id)
                .executeUpdate();
    }

    @Override
    public List<Grupo> listarGrupo() {
        String sql = "SELECT * FROM grupo";
        return entityManager.createNativeQuery(sql, Grupo.class).getResultList();
    }
}
