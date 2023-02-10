package com.example.implementkeycloak.model.dto.response;

import com.example.implementkeycloak.constants.AssetApprovalStatus;
import com.example.implementkeycloak.constants.AssetClassification;
import com.example.implementkeycloak.constants.AssetStatus;
import lombok.Data;

import java.time.Instant;
import java.time.LocalDate;

@Data
public class AssetResponse {
    private String code;

    private String serialNumber;

    private String name;

    private AssetStatus status;

    private String description;

    private String productId;

    private String purchaseOrderId;

    private String assetTypeId;

    private Integer total;

    private String ownerId;

    private AssetClassification assetClassification; // phân loại tài sản

    private LocalDate startUsedDate;

    private String referenceId;

    private String transferUserId;

    private AssetApprovalStatus approvalStatus;

    private Instant lastAssetInventoryAt;

}
