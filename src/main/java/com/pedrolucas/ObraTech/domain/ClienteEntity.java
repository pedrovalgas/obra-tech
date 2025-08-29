package com.pedrolucas.ObraTech.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "clientes")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ClienteEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String cpfCnpj;

    private String telefone;

    private String email;

    @Embedded
    private Endereco endereco;

    @OneToMany(mappedBy = "cliente")
    private List<ProjetoEntity> projetos;

}
