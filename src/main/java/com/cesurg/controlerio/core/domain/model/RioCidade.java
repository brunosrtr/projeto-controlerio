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
    private Long idRio;

    @Column(name = "id_cidade")
    private Long idCidade;

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

    public Long getIdRio() {
        return idRio;
    }

    public void setIdRio(Long idRio) {
        this.idRio = idRio;
    }

    public Long getIdCidade() {
        return idCidade;
    }

    public void setIdCidade(Long idCidade) {
        this.idCidade = idCidade;
    }
}
