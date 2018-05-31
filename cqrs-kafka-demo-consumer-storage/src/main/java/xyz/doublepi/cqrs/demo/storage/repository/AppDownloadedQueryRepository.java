package xyz.doublepi.cqrs.demo.storage.repository;

import xyz.doublepi.cqrs.demo.storage.model.AppDownload;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppDownloadedQueryRepository extends JpaRepository<AppDownload, Long> {

    List<AppDownload> findByUserId(Long userId);

    List<AppDownload> findByAppId(Long appId);

    Long countByAppId(Long appId);

    Long countByUserId(Long userId);
}
