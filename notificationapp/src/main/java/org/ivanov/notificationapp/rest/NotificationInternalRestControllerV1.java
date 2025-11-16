package org.ivanov.notificationapp.rest;

import lombok.RequiredArgsConstructor;
import org.ivanov.notificationapp.dto.NotificationDto;
import org.ivanov.notificationapp.service.NotificationService;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequiredArgsConstructor
@RequestMapping("/internal/api/v1/notifications")
public class NotificationInternalRestControllerV1 {

    private final NotificationService notificationService;

    @PostMapping
    public NotificationDto createNotification(@RequestBody NotificationDto dto) {
        return notificationService.save(dto);
    }

    @GetMapping("/{uid}")
    public NotificationDto getNotificationByUid(@PathVariable("uid") String uid) {
        return notificationService.getByUid(UUID.fromString(uid));
    }
}