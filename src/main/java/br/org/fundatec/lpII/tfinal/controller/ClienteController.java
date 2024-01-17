package br.org.fundatec.lpII.tfinal.controller;

import br.org.fundatec.lpII.tfinal.controller.request.ClienteRequest;
import br.org.fundatec.lpII.tfinal.controller.response.ClienteResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/clientes")
public class ClienteController {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ClienteResponse criarCliente(
            @RequestBody ClienteRequest clienteRequest
    ) {
        return new ClienteResponse();
    }

    @GetMapping
    public List<ClienteResponse> listarClientes(
            @RequestParam(name = "nome", required = false) String nomeCliente
    ) {
        return List.of(
                ClienteResponse.builder()
                        .id(1)
                        .nome("Teste")
                        .cpf("cpf")
                        .build()
        );
    }

    @DeleteMapping(path = "/{id}")
    public void deletarCliente(@PathVariable Long id) {

    }

    @PutMapping(path = "/{id}")
    public ClienteResponse editarCliente(@PathVariable Long id) {
        return ClienteResponse.builder()
                .id(1)
                .nome("Teste")
                .cpf("cpf")
                .build();
    }

}
