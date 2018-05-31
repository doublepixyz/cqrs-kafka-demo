package xyz.doublepi.cqrs.demo.cache.repository;

import xyz.doublepi.cqrs.demo.cache.model.AppDownloadedCount;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppDownloadedCommandRepository extends CrudRepository<AppDownloadedCount, Long> {
}
