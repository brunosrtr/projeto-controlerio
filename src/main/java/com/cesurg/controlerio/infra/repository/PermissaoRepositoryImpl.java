package com.cesurg.controlerio.infra.repository;


import com.cesurg.controlerio.core.domain.interfaces.PermissaoRepository;
import com.cesurg.controlerio.core.domain.model.Grupo;
import com.cesurg.controlerio.core.domain.model.Permissao;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PermissaoRepositoryImpl implements PermissaoRepository {

    @PersistenceContext
    EntityManager entityManager;

    @Transactional
    @Override
    public void criarPermissao(Permissao permissao){
        String sql = "INSERT INTO permissao(acao) VALUES(:acao)";
        entityManager.createNativeQuery(sql)
                .setParameter("acao", permissao.getAcao())
                .executeUpdate();
    }

    @Transactional
    @Override
    public void atualizarPermissoes(Permissao permissao){
        String sql = "UPDATE permisao SET acao = :acao WHERE id = :id";
        entityManager.createNativeQuery(sql)
                .setParameter("acao", permissao.getAcao())
                .setParameter("id", permissao.getId())
                .executeUpdate();
    }

    @Transactional
    @Override
    public void deletarPermissao(Long id){
        String sql = "DELETE FROM permissao WHERE id = :id";
        entityManager.createNativeQuery(sql)
                .setParameter("id", id)
                .executeUpdate();
    }

    @Override
    public List<Permissao> listarPermissao(){
        String sql = "SELECT * FROM permissao";
        return entityManager.createNativeQuery(sql, Permissao.class).getResultList();
    }
}
