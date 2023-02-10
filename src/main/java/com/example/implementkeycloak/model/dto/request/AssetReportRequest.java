package com.example.implementkeycloak.model.dto.request;

import com.example.implementkeycloak.constants.ValidateConstraint;
import lombok.Data;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
public class AssetReportRequest {
    @Size(max = ValidateConstraint.LENGTH.ID_MAX_LENGTH, message = "USER_ID_MAX_LENGTH")
    private String userId;

    @NotBlank(message = "NOTE REQUIRED")
    @Size(max = ValidateConstraint.LENGTH.NOTE_MAX_LENGTH, message = "NOTE_LENGTH")
    private String note;

    @Range(min = 0, message = "TOTAL_GREATER_THAN")
    private Integer total;
}
