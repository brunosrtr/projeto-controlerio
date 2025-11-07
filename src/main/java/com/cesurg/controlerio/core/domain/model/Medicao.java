package com.cesurg.controlerio.core.domain.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDateTime;

@Entity
@Table(name = "medicao")
public class Medicao {
    @Id
    private int id;

    @Column(name = "altura")
    private double  altura;

    @Column(name = "clima")
    private String clima;

    @Column(name = "data_criacao")
    private LocalDateTime dataCriacao;

    @Column(name = "temperatura")
    private int temperatura;

    @Column(name = "id_usuario")
    private int idUsuario;

    @Column(name = "id_ponto_medicao")
    private int idPontoMedicao;

    public String getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getIdPontoMedicao() {
        return idPontoMedicao;
    }

    public void setIdPontoMedicao(int idPontoMedicao) {
        this.idPontoMedicao = idPontoMedicao;
    }
}
