package com.cesurg.controlerio.infra.repository;

import com.cesurg.controlerio.core.domain.model.PontoMedicao;
import com.cesurg.controlerio.core.interfaces.PontoMedicaoRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PontoMedicaoRepositoryImpl implements PontoMedicaoRepository {

    @PersistenceContext
    EntityManager entityManager;

    @Transactional
    @Override
    public List<PontoMedicao> listarPonto() {
        String sql = "SELECT id, nome FROM ponto_medicao";
        return entityManager.createNativeQuery(sql, PontoMedicao.class).getResultList();
    }

    @Transactional
    @Override
    public List<PontoMedicao> buscarPontoPorId(Long id) {
        String sql = "SELECT id, nome FROM ponto_medicao WHERE id = :id";
        return entityManager.createNativeQuery(sql, PontoMedicao.class).getResultList();
    }

    @Transactional
    @Override
    public void criarPonto(PontoMedicao pontoMedicao) {
        String sql = "INSERT INTO ponto_medicao (nome, altura_estavel, latitude, longitude) VALUES (:nome, :altura_estavel, latitude, longitude)";
        entityManager.createNativeQuery(sql)
                .setParameter("nome", pontoMedicao.getNome())
                .executeUpdate();
    }

    @Transactional
    @Override
    public void atualizarPonto(PontoMedicao pontoMedicao) {
        String sql = "UPDATE cidade SET nome = :nome WHERE id = :id";
        Query query = entityManager.createNativeQuery(sql)
                .setParameter("nome", pontoMedicao.getNome())
                .setParameter("id", pontoMedicao.getId());
        query.executeUpdate();
    }

    @Transactional
    @Override
    public void deletarPonto(Long id) {
        String sql = "DELETE FROM ponto_medicao WHERE id = :id";
        Query query = entityManager.createNativeQuery(sql)
                .setParameter("id", id);
        query.executeUpdate();
    }
}
