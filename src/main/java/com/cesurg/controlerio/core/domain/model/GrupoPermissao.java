package com.cesurg.controlerio.core.domain.model;

import jakarta.persistence.*;

@Entity
@Table(name = "grupo_permissa0")
public class GrupoPermissao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_grupo", referencedColumnName = "id", insertable = false, updatable = false)
    private Grupo grupo;

    private Integer idGrupo;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_permissao", referencedColumnName = "id", insertable = false, updatable = false)
    private Permissao permissao;

    private Integer idPermissao;

}
