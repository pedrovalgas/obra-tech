package com.pedrolucas.ObraTech.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "fornecedores")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class FornecedorEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nomeDaEmpresa;

    private String contato; //Nome da pessoa

    private String telefone;

    private String email;

    @Embedded
    private Endereco endereco;

    @OneToMany(mappedBy = "fornecedor")
    private List<MaterialEntity> materiais;

}
