package com.cesurg.controlerio.infra.repository;

import com.cesurg.controlerio.core.interfaces.UsuarioRepository;
import com.cesurg.controlerio.core.domain.model.Usuario;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UsuarioRepositoryImpl implements UsuarioRepository {

    @PersistenceContext
    EntityManager entityManager;

    @Transactional
    @Override
    public void criarUsuario(Usuario usuario) {
        String sql = "INSERT INTO usuario (nome, email, senha) VALUES (:nome, :email, :senha)";
        entityManager.createNativeQuery(sql)
                .setParameter("nome", usuario.getNome())
                .setParameter("email", usuario.getEmail())
                .setParameter("senha", usuario.getSenha())
                .executeUpdate();
    }

    @Override
    public List<Usuario> listarUsuario(){
        String sql = "SELECT * FROM usuario";
        return entityManager.createNativeQuery(sql, Usuario.class).getResultList();
    }

    @Transactional
    @Override
    public void deletarUsuario(Long id){
        String sql = "DELETE FROM usuario WHERE ID = :id";
        entityManager.createNativeQuery(sql)
                .setParameter("id", id)
                .executeUpdate();
    }

    @Transactional
    @Override
    public void atualizarUsuario(Usuario usuario){
        String sql = "UPDATE usuario SET nome = :nome, email = :email, senha = :senha WHERE id = :id";
        entityManager.createNativeQuery(sql)
                .setParameter("nome", usuario.getNome())
                .setParameter("email", usuario.getEmail())
                .setParameter("senha", usuario.getSenha())
                .setParameter("id", usuario.getId())
                .executeUpdate();
    }

    @Override
    public Usuario buscarUsuario(Long id){
        String sql = "SELECT * FROM usuario WHERE id = :id";

        return (Usuario) entityManager.createNativeQuery(sql, Usuario.class)
                .setParameter("id", id)
                .getSingleResult();
    }

    @Override
    public UserDetails buscarPorEmail(String email) {
        String sql = "SELECT email FROM usuario WHERE email = :id";

        return (Usuario) entityManager.createNativeQuery(sql, Usuario.class)
                .setParameter("email",email)
                .getSingleResult();
    }
}
