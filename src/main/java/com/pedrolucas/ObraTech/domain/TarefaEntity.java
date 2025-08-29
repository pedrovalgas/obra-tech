package com.pedrolucas.ObraTech.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "tarefas")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TarefaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String decricao;

    private StatusObra status;

    private LocalDateTime dataPrevista;

    private LocalDateTime dataConclusao;

    @ManyToOne
    private ProjetoEntity projeto;

    @ManyToOne
    private FuncionarioEntity funcionario;

}
