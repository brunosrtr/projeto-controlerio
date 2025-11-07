package com.cesurg.controlerio.core.domain.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "permissao")
public class Permissao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "acao")
    private String acao;

    public Permissao() {
    }

    public Permissao(long id, String acao) {
        this.id = id;
        this.acao = acao;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAcao() {
        return acao;
    }

    public void setAcao(String acao) {
        this.acao = acao;
    }
}
