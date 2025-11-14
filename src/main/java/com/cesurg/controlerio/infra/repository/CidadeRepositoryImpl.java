package com.cesurg.controlerio.infra.repository;

import com.cesurg.controlerio.core.interfaces.CidadeRepository;
import com.cesurg.controlerio.core.domain.model.Cidade;
import org.springframework.stereotype.Repository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Repository
public class CidadeRepositoryImpl implements CidadeRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Cidade> listar() {
        String sql = "SELECT id, nome FROM cidade";
        return entityManager.createNativeQuery(sql, Cidade.class).getResultList();
    }

    @Override
    public List<Cidade> buscarPorId(Long id) {
        String sql = "SELECT id, nome FROM cidade WHERE id = :id";
        return entityManager.createNativeQuery(sql, Cidade.class).getResultList();
    }

    @Transactional
    @Override
    public void criar(Cidade cidade) {
        String sql = "INSERT INTO cidade (nome) VALUES (:nome)";
        Query query = entityManager.createNativeQuery(sql)
        .setParameter("nome", cidade.getNome());
        query.executeUpdate();
    }

    @Transactional
    @Override
    public void atualizar(Cidade cidade) {
        String sql = "UPDATE cidade SET nome = :nome WHERE id = :id";
        Query query = entityManager.createNativeQuery(sql)
        .setParameter("nome", cidade.getNome())
        .setParameter("id", cidade.getId());
        query.executeUpdate();
    }

    @Transactional
    @Override
    public void deletar(Long id) {
        String sql = "DELETE FROM cidade WHERE id = :id";
        Query query = entityManager.createNativeQuery(sql)
        .setParameter("id", id);
        query.executeUpdate();
    }
}