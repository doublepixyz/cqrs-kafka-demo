package xyz.doublepi.cqrs.demo.cache.config;

import org.springframework.cloud.stream.annotation.EnableBinding;
import xyz.doublepi.cqrs.demo.cache.stream.AppDownloadedStreams;

@EnableBinding(AppDownloadedStreams.class)
public class StreamsConfig {
}
