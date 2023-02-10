package com.example.implementkeycloak.model.entity;

import com.example.implementkeycloak.constants.AssetApprovalStatus;
import com.example.implementkeycloak.constants.AssetClassification;
import com.example.implementkeycloak.constants.AssetStatus;
import com.example.implementkeycloak.constants.ValidateConstraint;
import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.time.Instant;
import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name = "asset", indexes = {
        @Index(name = "asset_id_idx", columnList = "id"),
        @Index(name = "asset_code_idx", columnList = "code"),
        @Index(name = "asset_deleted_idx", columnList = "deleted")
})
@Data
public class AssetEntity {

    @Id
    @Column(name = "id", length = ValidateConstraint.LENGTH.ID_MAX_LENGTH, nullable = false)
    private String id;

    @Column(name = "code", length = ValidateConstraint.LENGTH.CODE_MAX_LENGTH, nullable = false)
    private String code;

    @Column(name = "serial_number", length = ValidateConstraint.LENGTH.SERIAL_NUMBER_MAX_LENGTH)
    private String serialNumber;

    @Column(name = "name", length = ValidateConstraint.LENGTH.NAME_MAX_LENGTH, nullable = false)
    private String name;

    @Column(name = "status", length = ValidateConstraint.LENGTH.ENUM_MAX_LENGTH, nullable = false)
    @Enumerated(EnumType.STRING)
    private AssetStatus status;

    @Column(name = "description", length = ValidateConstraint.LENGTH.DESC_MAX_LENGTH)
    private String description;

    @Column(name = "product_id", length = ValidateConstraint.LENGTH.ID_MAX_LENGTH)
    private String productId;

    @Column(name = "purchase_order_id", length = ValidateConstraint.LENGTH.ID_MAX_LENGTH)
    private String purchaseOrderId;

    @Column(name = "asset_type_id", length = ValidateConstraint.LENGTH.ID_MAX_LENGTH)
    private String assetTypeId;

    @Column(name = "total")
    private Integer total;

    @Column(name = "owner_id", length = ValidateConstraint.LENGTH.ID_MAX_LENGTH)
    private String ownerId;

    @Column(name = "deleted")
    private Boolean deleted;

    @Column(name = "asset_classification", length = ValidateConstraint.LENGTH.ENUM_MAX_LENGTH)
    @Enumerated(EnumType.STRING)
    private AssetClassification assetClassification; // phân loại tài sản

    @Column(name = "start_used_date")
    private LocalDate startUsedDate;

    @Column(name = "reference_id", length = ValidateConstraint.LENGTH.ID_MAX_LENGTH)
    private String referenceId;

    @Column(name = "transfer_user_id", length = ValidateConstraint.LENGTH.ID_MAX_LENGTH)
    private String transferUserId;

    @Column(name = "approval_status", length = ValidateConstraint.LENGTH.ENUM_MAX_LENGTH)
    @Enumerated(EnumType.STRING)
    private AssetApprovalStatus approvalStatus;

    @Column(name = "last_asset_inventory_at")
    private Instant lastAssetInventoryAt;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        AssetEntity that = (AssetEntity) o;
        return id != null && Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
