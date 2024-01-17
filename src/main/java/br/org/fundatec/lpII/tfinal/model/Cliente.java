package br.org.fundatec.lpII.tfinal.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nome;

    private String identidade;

    private String cpf;

    @OneToOne
    @JoinColumn(name = "", columnDefinition = "string")
    private Endereco endereco;

}
