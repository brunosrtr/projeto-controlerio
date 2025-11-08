package com.cesurg.controlerio.infra.repository;

import com.cesurg.controlerio.core.domain.interfaces.RioRepository;
import com.cesurg.controlerio.core.domain.model.Medicao;
import com.cesurg.controlerio.core.domain.model.Rio;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class RioRepositoryImpl implements RioRepository{


    @Override
    public void adicionarRio(Rio rio) {

    }

    @Override
    public void deletarRio(String id) {

    }

    @Override
    public List<Rio> listarRios() {
        return List.of();
    }
}
