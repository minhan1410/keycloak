package com.example.implementkeycloak.service.impl;

import com.example.implementkeycloak.model.dto.request.Notification;
import com.example.implementkeycloak.service.ScheduleNotification;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class ScheduleNotificationImpl implements ScheduleNotification {

    @Override
    public void sendNotification(Notification notification) {

    }
}
