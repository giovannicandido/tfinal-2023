package br.org.fundatec.lpII.tfinal.controller.request;

import lombok.Data;

@Data
public class AdicionarPagamentoRequest {
    private Integer valorPago;
    private FormaPagamento formaPagamento;
}
