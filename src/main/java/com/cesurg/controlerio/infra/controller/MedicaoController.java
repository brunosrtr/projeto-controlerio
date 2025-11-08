package com.cesurg.controlerio.infra.controller;

import com.cesurg.controlerio.core.domain.interfaces.MedicaoUseCase;
import com.cesurg.controlerio.core.domain.model.Medicao;
import com.cesurg.controlerio.core.domain.model.Rio;
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

    @PutMapping("/{id}")
    public void atualizarMedicao (@RequestBody Medicao medicao) {
        medicaoUseCase.atualizarMedicao(medicao);
    }

    @DeleteMapping("/{id}")
    public void deletarMedicao(@PathVariable String id) {
        medicaoUseCase.deletarMedicao(id);
    }

    @GetMapping
    public List<Medicao> listarMedicoes() {
        return medicaoUseCase.listarMedicoes();
    }
}
