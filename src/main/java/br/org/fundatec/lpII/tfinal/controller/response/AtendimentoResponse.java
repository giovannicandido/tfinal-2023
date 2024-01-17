package br.org.fundatec.lpII.tfinal.controller.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AtendimentoResponse {
    private Integer id;
    private String nomeVeterinario;
    private String nomeAtendente;
    private Integer idCliente;
    private Integer valorConsulta;
    private LocalDateTime dataAbertura;
    private String estado;
    private LocalDateTime dataEncerramento;
}
