package br.org.fundatec.lpII.tfinal.controller.request;

import lombok.Data;

import java.util.List;

@Data
public class AdicionarProdutoRequest {
    private List<ProdutoId> produtos;
}
