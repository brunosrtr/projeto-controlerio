package com.cesurg.controlerio.core.domain.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "cidade")
public class Cidade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "nome")
    private String nome;

    @OneToMany(mappedBy = "cidade", fetch = FetchType.LAZY)
    private List<RioCidade> rios = new ArrayList<>();

    public Cidade(){}

    public Cidade(String nome){
        this.nome = nome;
        this.rios = new ArrayList<>();
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

    public List<RioCidade> getRios() { return rios;}

    public void setRios(List<RioCidade> rios) { this.rios = rios; }
}