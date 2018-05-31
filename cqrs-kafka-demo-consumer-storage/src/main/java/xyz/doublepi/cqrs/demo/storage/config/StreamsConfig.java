package xyz.doublepi.cqrs.demo.storage.config;

import org.springframework.cloud.stream.annotation.EnableBinding;
import xyz.doublepi.cqrs.demo.storage.stream.AppDownloadedStreams;

@EnableBinding(AppDownloadedStreams.class)
public class StreamsConfig {
}
