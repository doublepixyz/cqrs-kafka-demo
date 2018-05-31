package xyz.doublepi.cqrs.demo.cache.model;

// lombok autogenerates getters, setters, toString() and a builder (see https://projectlombok.org/):
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

@Getter
@Setter
@ToString
@Builder
@RedisHash("AppDownloadedCount")
public class AppDownloadedCount {

    @Id
    private Long appId;
    private Long downloadCount;
}
