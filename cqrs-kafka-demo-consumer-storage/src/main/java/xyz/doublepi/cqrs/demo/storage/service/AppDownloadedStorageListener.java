package xyz.doublepi.cqrs.demo.storage.service;

import xyz.doublepi.cqrs.demo.storage.model.DownloadEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;
import xyz.doublepi.cqrs.demo.storage.stream.AppDownloadedStreams;
import org.springframework.beans.factory.annotation.Autowired;

@Component
@Slf4j
public class AppDownloadedStorageListener {

    @Autowired
    AppDownloadedCommandService appDownloadedCommandService;

    @StreamListener(AppDownloadedStreams.INPUT)
    public void handle(@Payload DownloadEvent downloadEvent) {
        log.info("Received DownalodEvent: {}", downloadEvent);

        appDownloadedCommandService.save(downloadEvent);
    }
}
