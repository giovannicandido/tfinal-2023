package br.org.fundatec.lpII.tfinal.controller.response;

import br.org.fundatec.lpII.tfinal.model.Endereco;
import lombok.Builder;
import lombok.Data;

import java.util.List;

/**
 * "logradouro": "Av. Ipiranga",
 *  *         "numero": 1200,
 *  *         "bairro": "Jardim Carvalho",
 *  *         "cidade": "Porto Alegre",
 *  *         "estado": "RS"
 */
@Data
@Builder
public class EnderecoResponse {
    private Integer id;
    private String logradouro;
    private Integer numero;
    private String bairro;
    private String cidade;
    private String estado;

    public static List<EnderecoResponse> of(List<Endereco> endereco) {
        return endereco.stream()
                .map(EnderecoResponse::of)
                .toList();
    }

    public static EnderecoResponse of(Endereco endereco) {
        return EnderecoResponse.builder()
                .id(endereco.getId())
                .bairro(endereco.getBairro())
                .cidade(endereco.getCidade())
                .numero(endereco.getNumero())
                .logradouro(endereco.getLogradouro())
                .build();
    }
}
