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
        String sql = "INSERT INTO usuario (nome, email, senha, grupo) VALUES (:nome, :email, :senha, :grupo)";
        entityManager.createNativeQuery(sql)
                .setParameter("nome", usuario.getNome())
                .setParameter("email", usuario.getEmail())
                .setParameter("senha", usuario.getSenha())
                .setParameter("grupo", usuario.getGrupo().name())
                .executeUpdate();
    }

    @Override
    public List<Usuario> listarUsuario() {
        String sql = "SELECT * FROM usuario";
        return entityManager.createNativeQuery(sql, Usuario.class).getResultList();
    }

    @Transactional
    @Override
    public void deletarUsuario(Long id) {
        String sql = "DELETE FROM usuario WHERE id = :id";
        entityManager.createNativeQuery(sql)
                .setParameter("id", id)
                .executeUpdate();
    }

    @Transactional
    @Override
    public void atualizarUsuario(Usuario usuario) {
        String sql = "UPDATE usuario SET nome = :nome, email = :email, senha = :senha, grupo = :grupo WHERE id = :id";
        entityManager.createNativeQuery(sql)
                .setParameter("nome", usuario.getNome())
                .setParameter("email", usuario.getEmail())
                .setParameter("senha", usuario.getSenha())
                .setParameter("grupo", usuario.getGrupo().name())
                .setParameter("id", usuario.getId())
                .executeUpdate();
    }

    @Override
    public Usuario buscarUsuario(Long id) {
        String sql = "SELECT * FROM usuario WHERE id = :id";

        return (Usuario) entityManager.createNativeQuery(sql, Usuario.class)
                .setParameter("id", id)
                .getSingleResult();
    }

    @Override
    public UserDetails buscarPorEmail(String email) {
        String sql = "SELECT * FROM usuario WHERE email = :email";

        return (Usuario) entityManager.createNativeQuery(sql, Usuario.class)
                .setParameter("email", email)
                .getSingleResult();
    }
}
