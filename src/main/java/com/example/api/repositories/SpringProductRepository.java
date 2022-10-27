package com.example.api.repositories;

import com.example.api.entities.SpringProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SpringProductRepository extends JpaRepository<SpringProductEntity, Integer> {
    List<SpringProductEntity> findAllBy();
}
