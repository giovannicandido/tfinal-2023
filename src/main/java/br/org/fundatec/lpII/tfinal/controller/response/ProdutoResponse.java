package br.org.fundatec.lpII.tfinal.controller.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProdutoResponse {
    private Long id;
    private String nome;
    private Integer preco;
    private String descricao;
    private Integer quantidadeEstoque;
}
