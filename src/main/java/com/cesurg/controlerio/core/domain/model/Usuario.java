package com.cesurg.controlerio.core.domain.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Entity
@Table (name = "usuario")
public class Usuario implements UserDetails {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "email")
    private String email;

    @JsonIgnore
    @Column(name = "senha")
    private String senha;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_grupo")
    private Role grupo;

    @OneToMany(mappedBy = "usuario", fetch = FetchType.LAZY)
    private List<Medicao> medicoes = new ArrayList<>();

    public Usuario() {}

    public Usuario(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    public void setId(long id) { this.id = id; }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Role getGrupo() { return grupo; }

    public void setGrupo(Role grupo) { this.grupo = grupo; }

    public List<Medicao> getMediocoes() { return medicoes; }

    public void setMediocoes(List<Medicao> mediocoes) { this.medicoes = mediocoes; }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        if(this.grupo == Role.ADMIN) return List.of(new SimpleGrantedAuthority("ROLE_ADMIN"), new SimpleGrantedAuthority("ROLE_USER"));
        if(this.grupo == Role.BOMBEIRO) return List.of(new SimpleGrantedAuthority("ROLE_BOMBEIRO"));
        else return List.of(new SimpleGrantedAuthority("ROLE_RADIO"));
    }

    @Override
    public String getPassword() {
        return "";
    }

    @Override
    public String getUsername() {
        return email;
    }

    @Override
    public boolean isAccountNonExpired() {
        return UserDetails.super.isAccountNonExpired();
    }

    @Override
    public boolean isAccountNonLocked() {
        return UserDetails.super.isAccountNonLocked();
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return UserDetails.super.isCredentialsNonExpired();
    }

    @Override
    public boolean isEnabled() {
        return UserDetails.super.isEnabled();
    }
}