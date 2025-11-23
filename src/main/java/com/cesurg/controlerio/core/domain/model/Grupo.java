package com.cesurg.controlerio.core.domain.model;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "grupo")
public class Grupo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "nome")
    private String nome;

    @OneToMany(mappedBy = "grupo", fetch = FetchType.LAZY)
    private List<GrupoPermissao> permissaos = new ArrayList<>();

    @OneToMany(mappedBy = "grupo", fetch = FetchType.LAZY)
    private List<Usuario> usuarios = new ArrayList<>();

    public Grupo() {}

    public Grupo(String nome) {
        this.nome = nome;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<GrupoPermissao> getPermissaos() { return permissaos; }

    public void setPermissaos(List<GrupoPermissao> permissaos) { this.permissaos = permissaos; }

    public List<Usuario> getUsuarios() { return usuarios; }

    public void setUsuarios(List<Usuario> usuarios) { this.usuarios = usuarios; }
}