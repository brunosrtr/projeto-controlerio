package com.cesurg.controlerio.infra.repository;


import jakarta.persistence.Entity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

@Repository
public class GrupoRepositoryImpl {

    @PersistenceContext
    EntityManager entityManager;

    @Transactional
    @Override


}
