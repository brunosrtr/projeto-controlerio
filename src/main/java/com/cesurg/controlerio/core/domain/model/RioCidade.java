package com.cesurg.controlerio.core.domain.model;

import jakarta.persistence.*;

@Entity
@Table(name = "rio_cidade")
public class RioCidade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_rio")
    private Rio rio;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_cidade")
    private Cidade cidade;

    public RioCidade() {}

    public RioCidade(Rio rio, Cidade cidade) {
        this.rio = rio;
        this.cidade = cidade;
    }

    public Rio getRio() {
        return rio;
    }

    public void setRio(Rio rio) {
        this.rio = rio;
    }

    public Long getId() {
        return id;
    }


}
