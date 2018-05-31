package xyz.duoblepi.cqrs.demo.stream;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface AppDownloadedStreams {

    String OUTPUT = "app-downloaded-out";

    @Output(OUTPUT)
    MessageChannel outboundAppDownloaded();
}
