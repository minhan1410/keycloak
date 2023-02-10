package com.example.implementkeycloak.model.dto.request;

import com.example.implementkeycloak.constants.AssetClassification;
import com.example.implementkeycloak.constants.ValidateConstraint;
import lombok.Data;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@Data
public class AssetCreateRequest {

    @NotBlank(message = "NAME_REQUIRED")
    @Size(max = ValidateConstraint.LENGTH.NAME_MAX_LENGTH, message = "NAME_MAX_LENGTH")
    private String name;

    @Size(max = ValidateConstraint.LENGTH.CODE_MAX_LENGTH, message = "SERIAL_NUMBER_MAX_LENGTH")
    @Pattern(regexp = ValidateConstraint.FORMAT.CODE_PATTERN, message = "CODE INVALID")
    private String serialNumber;

    @Size(max = ValidateConstraint.LENGTH.DESC_MAX_LENGTH, message = "DESCRIPTION_MAX_LENGTH")
    private String description;

    @Size(max = ValidateConstraint.LENGTH.ID_MAX_LENGTH, message = "PRODUCT_ID_MAX_LENGTH")
    private String productId;

    @Size(max = ValidateConstraint.LENGTH.ID_MAX_LENGTH, message = "ASSET_TYPE_ID_MAX_LENGTH")
    private String assetTypeId;

    @Range(min = 0)
    private Integer total;

    @NotNull(message = "ASSET_CLASSIFICATION_REQUIRED")
    private AssetClassification assetClassification;

    private LocalDate startUsedDate;
}
