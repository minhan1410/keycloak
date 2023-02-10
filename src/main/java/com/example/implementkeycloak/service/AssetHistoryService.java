package com.example.implementkeycloak.service;

import com.example.implementkeycloak.model.dto.request.AssetHistorySearchRequest;
import com.example.implementkeycloak.model.entity.AssetHistoryEntity;

import java.util.List;

public interface AssetHistoryService {
    List<AssetHistoryEntity> search(AssetHistorySearchRequest request);

    Long count(AssetHistorySearchRequest request);
}
