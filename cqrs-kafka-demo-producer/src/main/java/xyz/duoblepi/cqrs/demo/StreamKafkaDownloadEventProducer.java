package xyz.duoblepi.cqrs.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StreamKafkaDownloadEventProducer {

    public static void main(String[] args) {
        SpringApplication.run(StreamKafkaDownloadEventProducer.class, args);
    }
}
