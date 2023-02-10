package com.example.implementkeycloak.service;


import com.example.implementkeycloak.model.dto.request.Notification;

public interface ScheduleNotification {
    void sendNotification(Notification notification);
}
