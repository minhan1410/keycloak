package com.example.implementkeycloak.model.dto.request;

import com.example.implementkeycloak.constants.AssetTypeStatus;
import com.example.implementkeycloak.constants.ValidateConstraint;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Data
public class AssetTypeCreateRequest {

    @NotBlank(message = "CODE_REQUIRED")
    @Size(max = ValidateConstraint.LENGTH.CODE_MAX_LENGTH, message = "CODE_MAX_LENGTH")
    @Pattern(regexp = ValidateConstraint.FORMAT.CODE_PATTERN, message = "CODE INVALID")
    private String code;

    @NotBlank(message = "NAME_REQUIRED")
    @Size(max = ValidateConstraint.LENGTH.NAME_MAX_LENGTH, message = "NAME_MAX_LENGTH")
    private String name;

    @Size(max = ValidateConstraint.LENGTH.DESC_MAX_LENGTH, message = "DESCRIPTION_MAX_LENGTH")
    private String description;

    private AssetTypeStatus status;
}
