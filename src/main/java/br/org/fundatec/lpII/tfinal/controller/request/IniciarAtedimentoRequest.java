package br.org.fundatec.lpII.tfinal.controller.request;

import lombok.Data;

import java.util.List;

@Data
public class IniciarAtedimentoRequest {
    private String nomeVeterinario;
    private String nomeAtendente;
    private Integer idCliente;
    private Integer valorConsulta;
    private List<ProdutoId> produtos;
}
