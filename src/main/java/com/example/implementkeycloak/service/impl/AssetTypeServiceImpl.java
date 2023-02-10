package com.example.implementkeycloak.service.impl;

import com.example.implementkeycloak.model.dto.request.AssetTypeCreateRequest;
import com.example.implementkeycloak.model.dto.request.AssetTypeSearchRequest;
import com.example.implementkeycloak.model.dto.request.AssetTypeUpdateRequest;
import com.example.implementkeycloak.model.entity.AssetTypeEntity;
import com.example.implementkeycloak.service.AssetTypeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AssetTypeServiceImpl implements AssetTypeService {

    @Override
    public AssetTypeEntity createAssetType(AssetTypeCreateRequest request) {
        return null;
    }

    @Override
    public void deleteAssetType(String id) {

    }

    @Override
    public AssetTypeEntity updateAssetType(String id, AssetTypeUpdateRequest request) {
        return null;
    }

    @Override
    public void active(String id) {

    }

    @Override
    public void inactive(String id) {

    }

    @Override
    public AssetTypeEntity findAssetById(String id) {
        return null;
    }

    @Override
    public List<AssetTypeEntity> search(AssetTypeSearchRequest request) {
        return null;
    }

    @Override
    public Long count(AssetTypeSearchRequest request) {
        return null;
    }

    @Override
    public List<AssetTypeEntity> autoComplete(AssetTypeSearchRequest request) {
        return null;
    }

    @Override
    public AssetTypeEntity getAssetTypeById(String id) {
        return null;
    }
}
