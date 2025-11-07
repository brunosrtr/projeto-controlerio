package com.cesurg.controlerio.infra.repository;

import com.cesurg.controlerio.core.domain.interfaces.UsuarioRepository;
import com.cesurg.controlerio.core.domain.model.Usuario;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

@Repository
public class UsuarioRepositoryImpl implements UsuarioRepository {

    @PersistenceContext
    EntityManager entityManager;

    @Transactional
    @Override
    public void create(Usuario usuario){
        String query = "INSERT INTO usuario (nome, email, senha) VALUES (:nome, :email, :senha)";
        entityManager.createNativeQuery(query)
                .setParameter("nome", usuario.getNome())
                .setParameter("email",usuario.getEmail())
                .setParameter("senha",usuario.getSenha())
                        .executeUpdate();
    }
}
