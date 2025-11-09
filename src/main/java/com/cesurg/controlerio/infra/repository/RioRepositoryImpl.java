package com.cesurg.controlerio.infra.repository;

import com.cesurg.controlerio.core.domain.interfaces.RioRepository;
import com.cesurg.controlerio.core.domain.model.Medicao;
import com.cesurg.controlerio.core.domain.model.Rio;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class RioRepositoryImpl implements RioRepository{

    @PersistenceContext
    EntityManager entityManager;

    @Transactional
    @Override
    public void adicionarRio(Rio rio) {
        String query = "INSERT INTO rio (nome) VALUES (:nome)";
        entityManager.createNativeQuery(query, Rio.class)
                .setParameter("nome", rio.getNome())
                .executeUpdate();
    }

    @Transactional
    @Override
    public void atualizarRio(Rio rio) {
        String query = "UPDATE rio SET nome = :nome WHERE id = :id";
        entityManager.createNativeQuery(query, Rio.class)
                .setParameter("nome", rio.getNome())
                .setParameter("id", rio.getId())
                .executeUpdate();
    }

    @Transactional
    @Override
    public void deletarRio(Long id) {
        String query = "DELETE FROM rio WHERE id = :id";
        entityManager.createNativeQuery(query, Rio.class)
                .setParameter("id", id)
                .executeUpdate();
    }

    @Override
    public List<Rio> listarRios() {
        String query = "SELECT * FROM rio";
        return entityManager.createNativeQuery(query, Rio.class).getResultList();
    }
}
