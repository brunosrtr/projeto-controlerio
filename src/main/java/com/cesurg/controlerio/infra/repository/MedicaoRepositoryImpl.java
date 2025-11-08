package com.cesurg.controlerio.infra.repository;

import com.cesurg.controlerio.core.domain.interfaces.MedicaoRepository;
import com.cesurg.controlerio.core.domain.model.Medicao;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MedicaoRepositoryImpl implements MedicaoRepository {

    @PersistenceContext
    EntityManager entityManager;

    @Transactional

    @Override
    public void adicionarMedicao(Medicao medicao) {
        String query = "INSERT INTO medicao (altura, clima, data_criacao, temperatura, id_usuario, id_ponto_medicao)" +
        " VALUES (:altura, :clima, :data_criacao, :temperatura, :id_usuario, :id_ponto_medicao)";
        entityManager.createNativeQuery(query, Medicao.class)
                .setParameter("altura", medicao.getAltura())
                .setParameter("clima", medicao.getClima())
                .setParameter("clima", medicao.getClima())
                .setParameter("data_criacao", medicao.getDataCriacao())
                .setParameter("temperatura", medicao.getClima())
                .setParameter("id_usuario", medicao.getIdUsuario())
                .setParameter("id_ponto_medicao", medicao.getIdPontoMedicao())
        .executeUpdate();
    }

    @Override
    public void atualizarMedicao(Medicao medicao) {
        String query = "UPDATE medicao SET altura = :altura, clima = :clima, data_criacao = :data_criacao" +
                "temperatura = :temperatura, id_usuario = :id_usuario, id_ponto_medicao = :id_ponto_medicao" +
                "WHERE id = :id";
        entityManager.createNativeQuery(query, Medicao.class)
                .setParameter("altura", medicao.getAltura())
                .setParameter("clima", medicao.getClima())
                .setParameter("clima", medicao.getClima())
                .setParameter("data_criacao", medicao.getDataCriacao())
                .setParameter("temperatura", medicao.getClima())
                .setParameter("id_usuario", medicao.getIdUsuario())
                .setParameter("id_ponto_medicao", medicao.getIdPontoMedicao())
                .executeUpdate();
    }


    @Override
    public void deletarMedicao(String id) {
        String query = "DELETE FROM medicao WHERE id = :id";
        entityManager.createNativeQuery(query, Medicao.class)
                .setParameter("id", id)
                .executeUpdate();
    }

    @Override
    public List<Medicao> listarMedicoes() {
        String query = "SELECT * FROM medicao";
        return entityManager.createNativeQuery(query, Medicao.class).getResultList();
    }

}
