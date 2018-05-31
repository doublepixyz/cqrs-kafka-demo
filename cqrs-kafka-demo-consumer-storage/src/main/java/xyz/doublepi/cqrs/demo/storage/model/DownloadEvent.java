package xyz.doublepi.cqrs.demo.storage.model;

// lombok autogenerates getters, setters, toString() and a builder (see https://projectlombok.org/):
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Builder
public class DownloadEvent {

    private Long userId;
    private Long appId;
    private long timestamp;
}
