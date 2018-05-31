package xyz.duoblepi.cqrs.demo.config;

import org.springframework.cloud.stream.annotation.EnableBinding;
import xyz.duoblepi.cqrs.demo.stream.AppDownloadedStreams;

@EnableBinding(AppDownloadedStreams.class)
public class StreamsConfig {
}
