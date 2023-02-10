package com.example.implementkeycloak.model.dto.request;

import com.example.implementkeycloak.constants.ValidateConstraint;
import lombok.Data;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@Data
public class AssetTransferRequest {
    @NotBlank(message = "OWNER_ID_REQUIRED")
    @Size(max = ValidateConstraint.LENGTH.ID_MAX_LENGTH, message = "OWNER ID LENGTH")
    private String ownerId;

    @Range(min = 0, message = "TOTAL_GREATER_THAN")
    private Integer total;

    private LocalDate startUsedDate;

    @NotBlank(message = "NOTE REQUIRED")
    @Size(max = ValidateConstraint.LENGTH.NOTE_MAX_LENGTH, message = "NOTE_LENGTH")
    private String note;
}
