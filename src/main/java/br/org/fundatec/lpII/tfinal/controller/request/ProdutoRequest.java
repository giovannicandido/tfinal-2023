package br.org.fundatec.lpII.tfinal.controller.request;

import lombok.Data;

@Data
public class ProdutoRequest {
    private String nome;
    private Integer preco;
    private String descricao;
}
