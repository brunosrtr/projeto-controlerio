package com.cesurg.controlerio.core.domain.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "rio")
public class Rio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "nome")
    private String nome;

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    @OneToMany(mappedBy = "rio", fetch = FetchType.LAZY)
    private List<RioCidade> cidades = new ArrayList<>();

    @JsonIgnore
    @OneToMany(mappedBy = "rio", fetch = FetchType.LAZY)
    private List<PontoMedicao> pontos = new ArrayList<>();

    public Rio(){}

    public Rio(String nome) {
        this.nome = nome;
        this.cidades = new ArrayList<>();
    }

    public void setId(Long id) { this.id = id; }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<RioCidade> getCidades() { return cidades; }

    public void setCidades(List<RioCidade> cidades) { this.cidades = cidades; }

    public List<PontoMedicao> getPontos() {return pontos;}

    public void setPontos(List<PontoMedicao> pontos) { this.pontos = pontos; }
}
