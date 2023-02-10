package com.example.implementkeycloak.controller;

import com.example.implementkeycloak.model.dto.request.AssetSearchRequest;
import com.example.implementkeycloak.model.dto.request.AssetUpdateRequest;
import com.example.implementkeycloak.model.dto.response.AssetResponse;
import com.example.implementkeycloak.service.AssetService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/assets")
@Validated
@RequiredArgsConstructor
public class AssetController {
    private final AssetService assetService;

    @PostMapping("")
    ResponseEntity<AssetResponse> create(/*@RequestBody AssetCreateRequest request*/){
        return ResponseEntity.ok(assetService.createAsset(null));
    }

    @PostMapping("/{id}/update")
    ResponseEntity<AssetResponse>  update(@PathVariable("id") String id, @RequestBody AssetUpdateRequest request){
        return ResponseEntity.ok(assetService.updateAsset(id, request));
    }

    @GetMapping("/{id}/owner")
    ResponseEntity<List<AssetResponse>> getAssetByOwnerId(@PathVariable("id") String ownerId) {
        return ResponseEntity.ok(assetService.getAssetByOwnerID(ownerId));
    }

    @GetMapping("/search")
    ResponseEntity<List<AssetResponse>> search(AssetSearchRequest request){
        return ResponseEntity.ok(assetService.search(request));
    }

}
