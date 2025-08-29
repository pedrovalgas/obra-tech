package com.pedrolucas.ObraTech.repository;

import com.pedrolucas.ObraTech.domain.MaterialEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MaterialRepository extends JpaRepository<MaterialEntity, Long> {
}
