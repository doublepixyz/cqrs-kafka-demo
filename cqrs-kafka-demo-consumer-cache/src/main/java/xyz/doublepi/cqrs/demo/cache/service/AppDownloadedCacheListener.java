package xyz.doublepi.cqrs.demo.cache.service;

import xyz.doublepi.cqrs.demo.cache.model.DownloadEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;
import xyz.doublepi.cqrs.demo.cache.stream.AppDownloadedStreams;
import org.springframework.beans.factory.annotation.Autowired;

@Component
@Slf4j
public class AppDownloadedCacheListener {

    @Autowired
    private AppDownloadedCountIncreaseService appDownloadedCommandService;

    @StreamListener(AppDownloadedStreams.INPUT)
    public void handle(@Payload DownloadEvent event) {
        log.info("Received DownalodEvent: {}", event);

        appDownloadedCommandService.increaseDownloadCount(event);
    }
}
