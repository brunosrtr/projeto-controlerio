package com.cesurg.controlerio.infra.repository;

import com.cesurg.controlerio.core.domain.model.Rio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RioRepository extends JpaRepository <Rio, String> {
}
