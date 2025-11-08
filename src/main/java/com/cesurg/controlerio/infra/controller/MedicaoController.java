package com.cesurg.controlerio.infra.controller;

import com.cesurg.controlerio.core.domain.interfaces.MedicaoUseCase;
import com.cesurg.controlerio.core.domain.model.Medicao;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/medicoes")
public class MedicaoController {

    private final MedicaoUseCase medicaoUseCase;

    public MedicaoController(MedicaoUseCase medicaoUseCase) {
        this.medicaoUseCase = medicaoUseCase;
    }

    @PostMapping
    public void adicionarMedicao(@RequestBody Medicao medicao) {
        medicaoUseCase.adicionarMedicao(medicao);
    }

    @DeleteMapping("/{id}")
    public void deletarMedicao(@PathVariable String id) {
        medicaoUseCase.deletarMedicao(id);
    }
}
