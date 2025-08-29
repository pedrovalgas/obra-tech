package com.pedrolucas.ObraTech.domain;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Table(name = "materiais")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MaterialEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nomeDoMaterial;

    private BigDecimal quantidadeEmEstoque;

    private UnidadeDeMedida unidade;

    private BigDecimal precoUnitario;

    @ManyToOne
    private FornecedorEntity fornecedor;


}
