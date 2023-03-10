package com.example.implementkeycloak.repository;

import com.example.implementkeycloak.model.entity.AssetEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssetRepository extends JpaRepository<AssetEntity, String> {
}
