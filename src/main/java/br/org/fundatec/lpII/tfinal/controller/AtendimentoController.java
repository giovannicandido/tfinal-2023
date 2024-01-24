package br.org.fundatec.lpII.tfinal.controller;

import br.org.fundatec.lpII.tfinal.controller.request.AdicionarPagamentoRequest;
import br.org.fundatec.lpII.tfinal.controller.request.AdicionarProdutoRequest;
import br.org.fundatec.lpII.tfinal.controller.request.EditarAtendimentoRequest;
import br.org.fundatec.lpII.tfinal.controller.request.IniciarAtedimentoRequest;
import br.org.fundatec.lpII.tfinal.controller.response.AtendimentoResponse;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping(path = "/atendimentos")
public class AtendimentoController {

    @PostMapping
    public void iniciarAtendimento(
            @RequestBody @Valid IniciarAtedimentoRequest iniciarAtedimentoRequest
            ) {

    }

    @GetMapping
    public List<AtendimentoResponse> buscarAtendimento(
            @RequestParam(required = false) String estado,
            @RequestParam(required = false) List<String> sort,
            @RequestParam(required = false) LocalDate dataAberturaInicio,
            @RequestParam(required = false) LocalDate dataAberturaFim,
            @RequestParam(required = false) LocalDate dataEncerramentoInicio,
            @RequestParam(required = false) LocalDate dataEncerramentoFim,
            @RequestParam(required = false) Integer idCliente
    ) {
        return List.of(
                AtendimentoResponse.builder()
                        .id(1)
                        .id(1)
                        .dataAbertura(LocalDateTime.now())
                        .estado("ABERTO")
                        .valorConsulta(11000)
                        .nomeAtendente("Flavio")
                        .nomeVeterinario("Luana")
                        .idCliente(2)
                        .build()
        );
    }

    @PatchMapping("/{id}")
    public void editarAtendimento(
            @PathVariable Integer id,
            @RequestBody EditarAtendimentoRequest editarRequest
            ) {

    }

    @PostMapping("/{id}/produtos")
    public void adicionarProdutos(@RequestBody AdicionarProdutoRequest adicionarProdutoRequest) {

    }

    @DeleteMapping("/{id}/produtos")
    public void removerProdutos(@RequestBody AdicionarProdutoRequest adicionarProdutoRequest) {

    }

    @PostMapping("/{id}/pagamentos")
    public void adicionarPagamento(@RequestBody AdicionarPagamentoRequest adicionarPagamento) {

    }

    @PostMapping("/{id}/finalizar")
    public void finalizarAtendimento(
            @PathVariable Long id
    ) {

    }
}
