package com.cesurg.controlerio.core.domain.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Cidade {
    @Id
    private Long id;
    private String nome;

    public Cidade(){

    }

    public Cidade(Long id, String nome){
        this.id = id;
        this.nome = nome;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
}