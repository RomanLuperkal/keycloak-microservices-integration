package org.ivanov.notificationapp.dto;

public record NotificationDto(String uid, Long createdAt, Long updatedAt, String message) {
}
