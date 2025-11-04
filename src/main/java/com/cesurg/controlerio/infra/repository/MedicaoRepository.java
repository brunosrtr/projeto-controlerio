package com.cesurg.controlerio.infra.repository;

import com.cesurg.controlerio.core.domain.model.Medicao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicaoRepository extends JpaRepository <Medicao, String>{

}
