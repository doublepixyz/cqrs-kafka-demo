package xyz.doublepi.cqrs.demo.storage.repository;

import xyz.doublepi.cqrs.demo.storage.model.AppDownload;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppDownloadCommandRepository extends JpaRepository<AppDownload, Long> {
}
