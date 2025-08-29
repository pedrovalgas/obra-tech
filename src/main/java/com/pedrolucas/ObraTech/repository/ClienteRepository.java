package com.pedrolucas.ObraTech.repository;

import com.pedrolucas.ObraTech.domain.ClienteEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<ClienteEntity, Long> {
}
