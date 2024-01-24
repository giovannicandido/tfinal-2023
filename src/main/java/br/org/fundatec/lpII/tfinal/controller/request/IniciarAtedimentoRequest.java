package br.org.fundatec.lpII.tfinal.controller.request;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.util.List;

@Data
public class IniciarAtedimentoRequest {

    @NotNull
    private String nomeVeterinario;
    private String nomeAtendente;
    private Integer idCliente;
    private Integer valorConsulta;
    private List<ProdutoId> produtos;
}
