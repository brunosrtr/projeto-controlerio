package com.cesurg.controlerio.core.domain.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "permissao")
public class Permissao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "acao")
    private String acao;

    @OneToMany(mappedBy = "permissao", fetch = FetchType.LAZY)
    private List<GrupoPermissao> grupos = new ArrayList<>();

    public Permissao() {}

    public Permissao(String acao) {
        this.acao = acao;
    }

    public void setId(Long id) { this.id = id; }

    public Long getId() {
        return id;
    }

    public String getAcao() {
        return acao;
    }

    public void setAcao(String acao) {
        this.acao = acao;
    }

    public List<GrupoPermissao> getGrupos() {
        return grupos;
    }

    public void setGrupos(List<GrupoPermissao> grupos) {
        this.grupos = grupos;
    }
}
