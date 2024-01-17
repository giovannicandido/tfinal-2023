package br.org.fundatec.lpII.tfinal.controller;

import br.org.fundatec.lpII.tfinal.controller.request.ProdutoRequest;
import br.org.fundatec.lpII.tfinal.controller.response.ProdutoResponse;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.ExampleObject;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/produtos")
@Tag(name = "Produto Controller", description = "Cadastro de Produtos")
public class ProdutoController {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    @ApiResponse(
            responseCode = "201",
            description = "Produto criado com sucesso",
            content = { @Content(schema = @Schema($schema = "{\"bla\":\"test\"}"))}
    )
    public ProdutoResponse criarProduto(
            @RequestBody ProdutoRequest produtoRequest
    ) {
        return new ProdutoResponse();
    }

    @GetMapping
    public List<ProdutoResponse> listarProdutos(
            @RequestParam(required = false) String nome,
            @RequestParam(required = false) Integer precoMaiorQue,
            @RequestParam(required = false) Integer precoMenorQue
    ) {
        return List.of(
                ProdutoResponse.builder()
                        .id(1L)
                        .nome("Teste")
                        .descricao("descricao")
                        .quantidadeEstoque(0)
                        .preco(12000)
                        .build()
        );
    }

    @DeleteMapping(path = "/{idProduto}")
    public void deletarProduto(@PathVariable Long idProduto) {

    }

    @PutMapping(path = "/{idProduto}")
    public ProdutoResponse editarProduto(@PathVariable Long idProduto) {
        return ProdutoResponse.builder()
                .id(1L)
                .nome("Teste Edit")
                .descricao("descricao")
                .quantidadeEstoque(0)
                .preco(12000)
                .build();
    }

}
