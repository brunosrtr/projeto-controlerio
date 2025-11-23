package com.cesurg.controlerio.core.domain.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "ponto_medicao")
public class PontoMedicao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "altura_estavel")
    private Integer alturaEstavel;

    @Column(name = "latitude")
    private String latitude;

    @Column(name = "longitude")
    private String longitude;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_rio")
    private Rio rio;

    @OneToMany(mappedBy = "medicao", fetch = FetchType.LAZY)
    private List<Medicao> medicoes = new ArrayList<>();

    public PontoMedicao() {}

    public PontoMedicao(String nome, Integer alturaEstavel, String latitude, String longitude, Rio rio) {
        this.nome = nome;
        this.alturaEstavel = alturaEstavel;
        this.latitude = latitude;
        this.longitude = longitude;
        this.rio = rio;
    }

    public Long getId() { return id; }

    public String getNome() { return nome; }

    public void setNome(String nome) { this.nome = nome; }

    public Integer getAlturaEstavel() { return alturaEstavel; }

    public void setAlturaEstavel(Integer alturaEstavel) { this.alturaEstavel = alturaEstavel; }

    public String getLatitude() { return latitude; }

    public void setLatitude(String latitude) { this.latitude = latitude; }

    public String getLongitude() { return longitude; }

    public void setLongitude(String longitude) { this.longitude = longitude; }

    public Rio getRio() { return rio; }

    public void setRio(Rio rio) { this.rio = rio; }

    public List<Medicao> getMedicoes() { return medicoes; }

    public void setMedicoes(List<Medicao> medicoes) { this.medicoes = medicoes; }
}
