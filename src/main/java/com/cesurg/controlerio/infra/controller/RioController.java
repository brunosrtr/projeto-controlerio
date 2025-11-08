package com.cesurg.controlerio.infra.controller;


import com.cesurg.controlerio.core.domain.interfaces.RioUseCase;
import com.cesurg.controlerio.core.domain.model.Rio;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rios")
public class RioController {

    private final RioUseCase rioUseCase;

    public RioController(RioUseCase rioUseCase) {
        this.rioUseCase = rioUseCase;
    }

    @PostMapping
    public void adicionarRio (@RequestBody Rio rio) {
        rioUseCase.adicionarRio(rio);
    }

    @PutMapping("/{id}")
    public void atualizarRio (@RequestBody Rio rio) {
        rioUseCase.atualizarRio(rio);
    }

    @DeleteMapping("/{id}")
    public void deletarRio (@PathVariable String id) {
        rioUseCase.deletarRio(id);
    }

    @GetMapping
    public List<Rio> listarRios() {
        return rioUseCase.listarRios();
    }

}
