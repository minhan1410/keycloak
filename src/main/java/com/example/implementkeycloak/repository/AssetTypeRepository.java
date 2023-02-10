package com.example.implementkeycloak.repository;

import com.example.implementkeycloak.model.entity.AssetTypeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssetTypeRepository extends JpaRepository<AssetTypeEntity, String> {
}
