package com.example.implementkeycloak.model.dto.request;

import com.example.implementkeycloak.constants.AssetApprovalStatus;
import com.example.implementkeycloak.constants.AssetStatus;
import com.example.implementkeycloak.constants.ValidateConstraint;
import lombok.Data;

import javax.validation.constraints.Size;

@Data
public class AssetSearchRequest {
    @Size(max = ValidateConstraint.LENGTH.NAME_MAX_LENGTH, message = "KEYWORD_MAX_LENGTH")
    private String keyword;
    private AssetStatus status;
    private AssetApprovalStatus approvalStatus;
}
