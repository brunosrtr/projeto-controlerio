package com.cesurg.controlerio.infra.controller;

import com.cesurg.controlerio.core.domain.model.PontoMedicao;
import com.cesurg.controlerio.core.interfaces.PontoMedicaoUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pontos")
public class PontoMedicaoControler {

    @Autowired
    PontoMedicaoUseCase pontoMedicaoUseCase;

    @GetMapping
    public List<PontoMedicao> listarPonto() {
        return pontoMedicaoUseCase.listarPonto();
    }

    @GetMapping("/{id}")
    public List<PontoMedicao> buscarPontoPorId(@PathVariable Long id) {
        return pontoMedicaoUseCase.buscarPontoPorId(id);
    }

    @PostMapping
    public void criarPonto(@RequestBody PontoMedicao pontoMedicao) { pontoMedicaoUseCase.criarPonto(pontoMedicao);}

    @PutMapping
    public void atualizarPonto(@RequestBody PontoMedicao pontoMedicao) { pontoMedicaoUseCase.atualizarPonto(pontoMedicao);}

    @DeleteMapping("/{id}")
    public void deletarPonto(@PathVariable Long id) { pontoMedicaoUseCase.deletarPonto(id);}
}