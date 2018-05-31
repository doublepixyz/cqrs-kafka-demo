package xyz.doublepi.cqrs.demo.storage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StreamKafkaStorageConsumer {

    public static void main(String[] args) {
        SpringApplication.run(StreamKafkaStorageConsumer.class, args);
    }
}
