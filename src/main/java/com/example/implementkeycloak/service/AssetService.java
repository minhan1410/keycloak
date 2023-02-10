package com.example.implementkeycloak.service;

import com.example.implementkeycloak.model.dto.request.*;
import com.example.implementkeycloak.model.dto.response.AssetResponse;

import java.util.List;

public interface AssetService {
    AssetResponse createAsset(AssetCreateRequest request);

    AssetResponse updateAsset(String id, AssetUpdateRequest request);

    AssetResponse transferAsset(String id, AssetTransferRequest request);

    AssetResponse receiveAsset(String id);

    AssetResponse rejectReceiveAsset(String id, AssetReportRequest request);

    AssetResponse confirmReturnRequest(String id);

    AssetResponse rejectReturnRequest(String id, AssetReportRequest request);

    AssetResponse returnAsset(String id, AssetReportRequest request);

    AssetResponse reportDamagedAsset(String id, AssetReportRequest request);

    AssetResponse confirmDamagedAsset(String id);

    AssetResponse rejectDamagedAsset(String id, AssetReportRequest request);

    AssetResponse maintain(String id);

    AssetResponse maintainToUsed(String id);

    AssetResponse maintainToAvailable(String id);

    AssetResponse destroy(String id, AssetReportRequest request);

    AssetResponse availableToDestroy(String id, AssetReportRequest request);

    AssetResponse liquidate(String id);

    AssetResponse availableToLiquidate(String id, AssetReportRequest request);

    AssetResponse reportLost(String id, AssetReportRequest request);

    AssetResponse confirmLostAsset(String id);

    AssetResponse rejectLostAsset(String id, AssetReportRequest request);

    AssetResponse assetRecovery(String id, AssetReportRequest request);

    AssetResponse assetInventory(String id, AssetReportRequest request);

    void deleteAsset(String id);

    AssetResponse getAssetById(String id);

    List<AssetResponse> getAssetByOwnerID(String ownerId);

    List<AssetResponse> search(AssetSearchRequest request);

    List<AssetResponse> searchAutocomplete(AssetSearchRequest request);

    Long count(AssetSearchRequest request);

}
