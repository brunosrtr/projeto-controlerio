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

    @Override
    public List<PontoMedicao> listarPonto() {
        String sql = "SELECT * FROM ponto_medicao";
        return entityManager
                .createNativeQuery(sql, PontoMedicao.class)
                .getResultList();
    }

    @Override
    public List<PontoMedicao> buscarPontoPorId(Long id) {
        String sql = "SELECT * FROM ponto_medicao WHERE id = :id";
        return entityManager
                .createNativeQuery(sql, PontoMedicao.class)
                .setParameter("id", id)
                .getResultList();
    }

    @Transactional
    @Override
    public void criarPonto(PontoMedicao pontoMedicao) {
        String sql = """
            INSERT INTO ponto_medicao 
                (nome, altura_estavel, latitude, longitude)
            VALUES 
                (:nome, :altura_estavel, :latitude, :longitude)
        """;

        entityManager.createNativeQuery(sql)
                .setParameter("nome", pontoMedicao.getNome())
                .setParameter("altura_estavel", pontoMedicao.getAlturaEstavel())
                .setParameter("latitude", pontoMedicao.getLatitude())
                .setParameter("longitude", pontoMedicao.getLongitude())
                .executeUpdate();
    }

    @Transactional
    @Override
    public void atualizarPonto(PontoMedicao pontoMedicao) {
        String sql = """
            UPDATE ponto_medicao
            SET nome = :nome,
                altura_estavel = :altura_estavel,
                latitude = :latitude,
                longitude = :longitude
            WHERE id = :id
        """;

        Query query = entityManager.createNativeQuery(sql)
                .setParameter("nome", pontoMedicao.getNome())
                .setParameter("altura_estavel", pontoMedicao.getAlturaEstavel())
                .setParameter("latitude", pontoMedicao.getLatitude())
                .setParameter("longitude", pontoMedicao.getLongitude())
                .setParameter("id", pontoMedicao.getId());

        query.executeUpdate();
    }

    @Transactional
    @Override
    public void deletarPonto(Long id) {
        String sql = "DELETE FROM ponto_medicao WHERE id = :id";

        entityManager.createNativeQuery(sql)
                .setParameter("id", id)
                .executeUpdate();
    }
}
