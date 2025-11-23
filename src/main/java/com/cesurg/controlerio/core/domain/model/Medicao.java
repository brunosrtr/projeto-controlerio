package com.cesurg.controlerio.core.domain.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "medicao")
public class Medicao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "altura")
    private double  altura;

    @Column(name = "clima")
    private String clima;

    @Column(name = "data_criacao")
    private LocalDateTime dataCriacao;

    @Column(name = "temperatura")
    private int temperatura;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_usuario")
    private Usuario usuario;

    @Column(name = "id_ponto_medicao")
    private int idPontoMedicao;

    public Medicao() {}

    public Medicao(double altura, String clima, LocalDateTime dataCriacao, int temperatura) {
        this.altura = altura;
        this.clima = clima;
        this.dataCriacao = dataCriacao;
        this.temperatura = temperatura;
    }

    public Long getId() {
        return id;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getClima() {
        return clima;
    }

    public void setClima(String clima) {
        this.clima = clima;
    }

    public LocalDateTime getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDateTime dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    public int getIdPontoMedicao() {
        return idPontoMedicao;
    }

    public void setIdPontoMedicao(int idPontoMedicao) {
        this.idPontoMedicao = idPontoMedicao;
    }

    public Usuario getUsuario() { return usuario; }

    public void setUsuario(Usuario usuario) { this.usuario = usuario; }
}
