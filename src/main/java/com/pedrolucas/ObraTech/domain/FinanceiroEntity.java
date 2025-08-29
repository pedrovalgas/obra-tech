package com.pedrolucas.ObraTech.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "financeiro")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class FinanceiroEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private TipoFinanceiro tipo;

    private BigDecimal valor;

    private String descricao;

    private LocalDateTime data;

    @ManyToOne
    private ProjetoEntity projeto;
}
