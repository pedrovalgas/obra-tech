package com.pedrolucas.ObraTech.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "projetos")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProjetoEntity {

    @Id
    @GeneratedValue
    private Long id;

    private String nomeDaObra;

    private Endereco endereco;

    private LocalDateTime dataDeInicio;

    private LocalDateTime dataDePrevisaoDeFim;

    @Enumerated(EnumType.STRING)
    private StatusObra status;

    @ManyToOne
    private ClienteEntity cliente;

    @OneToMany(mappedBy = "projeto")
    private List<TarefaEntity> tarefas;

    @OneToMany(mappedBy = "projeto")
    private List<FuncionarioEntity> funcionarios;

    @OneToMany(mappedBy = "projeto")
    private List<FinanceiroEntity> movimentacoes;
}
