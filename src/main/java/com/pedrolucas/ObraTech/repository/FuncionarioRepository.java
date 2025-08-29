package com.pedrolucas.ObraTech.repository;

import com.pedrolucas.ObraTech.domain.FuncionarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FuncionarioRepository extends JpaRepository<FuncionarioEntity, Long> {
}
