package xyz.duoblepi.cqrs.demo.service;

import xyz.duoblepi.cqrs.demo.model.DownloadEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;
import org.springframework.util.MimeTypeUtils;
import xyz.duoblepi.cqrs.demo.stream.AppDownloadedStreams;

/**
 * This service is the {@code Command} creator, producer of {@link DownloadEvent}. It uses the <em>Message Queue</em> to
 * publish the <i>Event</i>.
 *
 * @author pi314
 */
@Service
@Slf4j
public class AppDownloadedEventService {

    private final AppDownloadedStreams appDownloadedStreams;

    public AppDownloadedEventService(AppDownloadedStreams downloadEventStreams) {
        this.appDownloadedStreams = downloadEventStreams;
    }

    public void sendAppDownloadedEvent(Long userId, Long appId) {
        DownloadEvent de = DownloadEvent.builder()
                .userId(userId)
                .appId(appId)
                .timestamp(System.currentTimeMillis())
                .build();

        send(de);
    }

    private void send(final DownloadEvent downloadEvent) {
        log.info("Sending DownloadEvent {}", downloadEvent);

        MessageChannel messageChannel = appDownloadedStreams.outboundAppDownloaded();
        messageChannel.send(MessageBuilder
                .withPayload(downloadEvent)
                .setHeader(MessageHeaders.CONTENT_TYPE, MimeTypeUtils.APPLICATION_JSON)
                .build());
    }
}
