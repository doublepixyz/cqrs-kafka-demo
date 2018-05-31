package xyz.doublepi.cqrs.demo.storage.stream;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface AppDownloadedStreams {

    String INPUT = "app-downloaded-in";

    @Input(INPUT)
    SubscribableChannel inboundAppDownloaded();

}
