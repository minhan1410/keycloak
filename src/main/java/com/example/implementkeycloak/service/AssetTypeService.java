package com.example.implementkeycloak.service;


import com.example.implementkeycloak.model.dto.request.AssetTypeCreateRequest;
import com.example.implementkeycloak.model.dto.request.AssetTypeSearchRequest;
import com.example.implementkeycloak.model.dto.request.AssetTypeUpdateRequest;
import com.example.implementkeycloak.model.entity.AssetTypeEntity;

import java.util.List;

public interface AssetTypeService {

    public AssetTypeEntity createAssetType(AssetTypeCreateRequest request);

    public void deleteAssetType(String id);

    public AssetTypeEntity updateAssetType(String id, AssetTypeUpdateRequest request);

    public void active(String id);

    public void inactive(String id);

    public AssetTypeEntity findAssetById(String id);

    public List<AssetTypeEntity> search(AssetTypeSearchRequest request);

    public Long count(AssetTypeSearchRequest request);

    public List<AssetTypeEntity> autoComplete(AssetTypeSearchRequest request);

    public AssetTypeEntity getAssetTypeById(String id);
}
