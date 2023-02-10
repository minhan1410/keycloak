package com.example.implementkeycloak.service.impl;

import com.example.implementkeycloak.model.dto.request.*;
import com.example.implementkeycloak.model.dto.response.AssetResponse;
import com.example.implementkeycloak.repository.AssetRepository;
import com.example.implementkeycloak.service.AssetService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AssetServiceImpl implements AssetService {
    private final AssetRepository assetRepository;

    @Override
    public AssetResponse createAsset(AssetCreateRequest request) {
        return null;
    }

    @Override
    public AssetResponse updateAsset(String id, AssetUpdateRequest request) {
        return null;
    }

    @Override
    public AssetResponse transferAsset(String id, AssetTransferRequest request) {
        return null;
    }

    @Override
    public AssetResponse receiveAsset(String id) {
        return null;
    }

    @Override
    public AssetResponse rejectReceiveAsset(String id, AssetReportRequest request) {
        return null;
    }

    @Override
    public AssetResponse confirmReturnRequest(String id) {
        return null;
    }

    @Override
    public AssetResponse rejectReturnRequest(String id, AssetReportRequest request) {
        return null;
    }

    @Override
    public AssetResponse returnAsset(String id, AssetReportRequest request) {
        return null;
    }

    @Override
    public AssetResponse reportDamagedAsset(String id, AssetReportRequest request) {
        return null;
    }

    @Override
    public AssetResponse confirmDamagedAsset(String id) {
        return null;
    }

    @Override
    public AssetResponse rejectDamagedAsset(String id, AssetReportRequest request) {
        return null;
    }

    @Override
    public AssetResponse maintain(String id) {
        return null;
    }

    @Override
    public AssetResponse maintainToUsed(String id) {
        return null;
    }

    @Override
    public AssetResponse maintainToAvailable(String id) {
        return null;
    }

    @Override
    public AssetResponse destroy(String id, AssetReportRequest request) {
        return null;
    }

    @Override
    public AssetResponse availableToDestroy(String id, AssetReportRequest request) {
        return null;
    }

    @Override
    public AssetResponse liquidate(String id) {
        return null;
    }

    @Override
    public AssetResponse availableToLiquidate(String id, AssetReportRequest request) {
        return null;
    }

    @Override
    public AssetResponse reportLost(String id, AssetReportRequest request) {
        return null;
    }

    @Override
    public AssetResponse confirmLostAsset(String id) {
        return null;
    }

    @Override
    public AssetResponse rejectLostAsset(String id, AssetReportRequest request) {
        return null;
    }

    @Override
    public AssetResponse assetRecovery(String id, AssetReportRequest request) {
        return null;
    }

    @Override
    public AssetResponse assetInventory(String id, AssetReportRequest request) {
        return null;
    }

    @Override
    public void deleteAsset(String id) {

    }

    @Override
    public AssetResponse getAssetById(String id) {
        return null;
    }

    @Override
    public List<AssetResponse> getAssetByOwnerID(String ownerId) {
        return null;
    }

    @Override
    public List<AssetResponse> search(AssetSearchRequest request) {
        return null;
    }

    @Override
    public List<AssetResponse> searchAutocomplete(AssetSearchRequest request) {
        return null;
    }

    @Override
    public Long count(AssetSearchRequest request) {
        return null;
    }
}
