package com.cesurg.controlerio.infra.repository;

import com.cesurg.controlerio.core.domain.interfaces.CidadeRepository;
import com.cesurg.controlerio.core.domain.model.Cidade;
import org.springframework.stereotype.Repository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Repository
@Transactional
public class CidadeRepositoryImpl implements CidadeRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Cidade> listar() {
        String sql = "SELECT id, nome FROM cidade";
        Query query = entityManager.createNativeQuery(sql);
        List<Object[]> resultados = query.getResultList();

        List<Cidade> cidades = new ArrayList<>();
        for (Object[] registro : resultados) {
            Cidade cidade = new Cidade();
            cidade.setId(((Number) registro[0]).intValue());
            cidade.setNome((String) registro[1]);
            cidades.add(cidade);
        }
        return cidades;
    }

    @Override
    public Cidade buscarPorId(int id) {
        String sql = "SELECT id, nome FROM cidade WHERE id = :id";
        Query query = entityManager.createNativeQuery(sql);
        query.setParameter("id", id);

        try {
            Object[] registro = (Object[]) query.getSingleResult();
            Cidade cidade = new Cidade();
            cidade.setId(((Number) registro[0]).intValue());
            cidade.setNome((String) registro[1]);
            return cidade;
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public void criar(Cidade cidade) {
        String sql = "INSERT INTO cidade (nome) VALUES (:nome)";
        Query query = entityManager.createNativeQuery(sql)
        .setParameter("nome", cidade.getNome());
        query.executeUpdate();
    }

    @Override
    public void atualizar(Cidade cidade) {
        String sql = "UPDATE cidade SET nome = :nome WHERE id = :id";
        Query query = entityManager.createNativeQuery(sql)
        .setParameter("nome", cidade.getNome())
        .setParameter("id", cidade.getId());
        query.executeUpdate();
    }

    @Override
    public void deletar(int id) {
        String sql = "DELETE FROM cidade WHERE id = :id";
        Query query = entityManager.createNativeQuery(sql)
        .setParameter("id", id);
        query.executeUpdate();
    }
}