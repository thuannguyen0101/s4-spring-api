package com.example.api.repositories;

import com.example.api.entities.SpringUsersEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SpringUserRepository extends JpaRepository<SpringUsersEntity, Integer> {
    List<SpringUsersEntity> findAllByName(String name);
    List<SpringUsersEntity> findAllByNameContainingIgnoreCase(String name);
    List<SpringUsersEntity> findAllByNameOrderByEmail(String name);
}
