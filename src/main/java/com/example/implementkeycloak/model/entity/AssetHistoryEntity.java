package com.example.implementkeycloak.model.entity;

import com.example.implementkeycloak.constants.AssetApprovalStatus;
import com.example.implementkeycloak.constants.AssetStatus;
import com.example.implementkeycloak.constants.ValidateConstraint;
import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "asset_history", indexes = {@Index(name = "asset_history_deleted_ids", columnList = "deleted")})
@Data
public class AssetHistoryEntity{
    @Id
    @Column(name = "id", length = ValidateConstraint.LENGTH.ID_MAX_LENGTH, nullable = false)
    private String id;

    @Column(name = "asset_id", length = ValidateConstraint.LENGTH.ID_MAX_LENGTH, nullable = false)
    private String assetId;

    @Column(name = "owner_id", length = ValidateConstraint.LENGTH.ID_MAX_LENGTH)
    private String ownerId;

    @Column(name = "status", length = ValidateConstraint.LENGTH.ENUM_MAX_LENGTH)
    @Enumerated(EnumType.STRING)
    private AssetStatus status;

    @Column(name = "description", length = ValidateConstraint.LENGTH.DESC_MAX_LENGTH)
    private String description;

    @Column(name = "note", length = ValidateConstraint.LENGTH.NOTE_MAX_LENGTH)
    private String note;

    @Column(name = "created_user_id", length = ValidateConstraint.LENGTH.ID_MAX_LENGTH)
    private String createdUserId;

    @Column(name = "approval_status", length = ValidateConstraint.LENGTH.ENUM_MAX_LENGTH)
    @Enumerated(EnumType.STRING)
    private AssetApprovalStatus approvalStatus;

    @Column(name = "deleted")
    private Boolean deleted;

}
