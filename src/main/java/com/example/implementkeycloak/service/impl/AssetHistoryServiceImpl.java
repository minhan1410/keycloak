package com.example.implementkeycloak.service.impl;

import com.example.implementkeycloak.model.dto.request.AssetHistorySearchRequest;
import com.example.implementkeycloak.model.entity.AssetHistoryEntity;
import com.example.implementkeycloak.service.AssetHistoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AssetHistoryServiceImpl implements AssetHistoryService {

    @Override
    public List<AssetHistoryEntity> search(AssetHistorySearchRequest request) {
        return null;
    }

    @Override
    public Long count(AssetHistorySearchRequest request) {
        return null;
    }
}
