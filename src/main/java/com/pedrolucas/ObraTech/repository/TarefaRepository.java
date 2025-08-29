package com.pedrolucas.ObraTech.repository;

import com.pedrolucas.ObraTech.domain.TarefaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TarefaRepository extends JpaRepository<TarefaEntity, Long> {
}
