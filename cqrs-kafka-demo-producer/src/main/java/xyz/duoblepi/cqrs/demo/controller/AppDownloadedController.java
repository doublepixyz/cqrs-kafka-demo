package xyz.duoblepi.cqrs.demo.controller;

import xyz.duoblepi.cqrs.demo.service.AppDownloadedEventService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppDownloadedController {

    private final AppDownloadedEventService createDownloadEventService;

    public AppDownloadedController(AppDownloadedEventService createDownloadEventService) {
        this.createDownloadEventService = createDownloadEventService;
    }

    @GetMapping("/api/v3/event/download")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void addDownloadCount(@RequestParam("userId") Long userId,
            @RequestParam("appId") Long appId) {

        createDownloadEventService.sendAppDownloadedEvent(userId, appId);
    }
}
