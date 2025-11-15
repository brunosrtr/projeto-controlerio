package com.cesurg.controlerio.core.domain.model;

import jakarta.persistence.*;

@Entity
@Table(name = "rio_cidade")
public class RioCidade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "id_rio")
    private Integer idRio;

    @Column(name = "id_cidade")
    private Integer idCidade;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_rio", referencedColumnName = "id", insertable = false, updatable = false)
    private Rio rio;

    public Rio getRio() {
        return rio;
    }

    public void setRio(Rio rio) {
        this.rio = rio;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getIdRio() {
        return idRio;
    }

    public void setIdRio(Integer idRio) {
        this.idRio = idRio;
    }

    public Integer getIdCidade() {
        return idCidade;
    }

    public void setIdCidade(Integer idCidade) {
        this.idCidade = idCidade;
    }
}
