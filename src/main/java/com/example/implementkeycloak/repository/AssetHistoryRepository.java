package com.example.implementkeycloak.repository;

import com.example.implementkeycloak.model.entity.AssetHistoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssetHistoryRepository extends JpaRepository<AssetHistoryEntity, String> {
}
