package com.pedrolucas.ObraTech.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "funcionarios")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class FuncionarioEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @Enumerated(EnumType.STRING)
    private Cargo cargo;

    private BigDecimal salario;

    private String telefone;

    private String email;

    @ManyToOne
    private ProjetoEntity projeto;

    @OneToMany(mappedBy = "funcionario")
    private List<TarefaEntity> tarefas;


}
