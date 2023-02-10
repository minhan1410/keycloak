package com.example.implementkeycloak.model.dto.request;

import com.example.implementkeycloak.constants.AssetApprovalStatus;
import lombok.Data;

@Data
public class AssetApprovalRequest {
    private AssetApprovalStatus approvalStatus;
}
