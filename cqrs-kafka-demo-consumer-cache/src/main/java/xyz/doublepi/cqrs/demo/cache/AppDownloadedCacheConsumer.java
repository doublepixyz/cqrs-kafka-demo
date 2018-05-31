package xyz.doublepi.cqrs.demo.cache;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppDownloadedCacheConsumer {

    public static void main(String[] args) {
        SpringApplication.run(AppDownloadedCacheConsumer.class, args);
    }
}
