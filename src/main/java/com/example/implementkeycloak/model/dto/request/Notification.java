package com.example.implementkeycloak.model.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Notification {
    private String targetId;
    private String title;
    private String content;
}
