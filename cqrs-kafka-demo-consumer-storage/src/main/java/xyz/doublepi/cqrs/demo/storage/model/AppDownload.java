package xyz.doublepi.cqrs.demo.storage.model;

// lombok autogenerates getters, setters, toString() and a builder (see https://projectlombok.org/):
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Builder
@Entity
@Table(name = "app_download")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class AppDownload {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Long userId;
    private Long appId;
    private long timestamp;

    public AppDownload() {
    }

    public AppDownload(Long id, Long userId, Long appId, long timestamp) {
        this.id = id;
        this.userId = userId;
        this.appId = appId;
        this.timestamp = timestamp;
    }

}
