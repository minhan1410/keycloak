package com.example.implementkeycloak.model.entity;

import com.example.implementkeycloak.constants.AssetTypeStatus;
import com.example.implementkeycloak.constants.ValidateConstraint;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "asset_type", indexes = {
        @Index(name = "asset_type_code_idx", columnList = "code"),
        @Index(name = "asset_type_deleted_idx", columnList = "deleted")
})
@Data
public class AssetTypeEntity {

    @Id
    @Column(name = "id", length = ValidateConstraint.LENGTH.ID_MAX_LENGTH, nullable = false)
    private String id;

    @Column(name = "code", length = ValidateConstraint.LENGTH.CODE_MAX_LENGTH, nullable = false)
    private String code;

    @Column(name = "name", length = ValidateConstraint.LENGTH.NAME_MAX_LENGTH, nullable = false)
    private String name;

    @Column(name = "status")
    @Enumerated(EnumType.STRING)
    private AssetTypeStatus status;

    @Column(name = "description", length = ValidateConstraint.LENGTH.DESC_MAX_LENGTH)
    private String description;

    @Column(name = "deleted")
    private Boolean deleted;

}
