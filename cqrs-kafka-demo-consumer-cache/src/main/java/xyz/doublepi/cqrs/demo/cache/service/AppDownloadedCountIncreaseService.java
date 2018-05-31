/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xyz.doublepi.cqrs.demo.cache.service;

import xyz.doublepi.cqrs.demo.cache.model.AppDownloadedCount;
import xyz.doublepi.cqrs.demo.cache.model.DownloadEvent;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.doublepi.cqrs.demo.cache.repository.AppDownloadedCommandRepository;
import lombok.extern.slf4j.Slf4j;

/**
 *
 * @author pi314
 */
@Service
@Slf4j
public class AppDownloadedCountIncreaseService {

    @Autowired
    private AppDownloadedCommandRepository appDownloadedCommandRepository;

    public void increaseDownloadCount(DownloadEvent event) {

        long total;
        Optional<AppDownloadedCount> od = appDownloadedCommandRepository.findById(event.getAppId());
        if (od.isPresent()) {
            // existing one
            long count = od.get().getDownloadCount();

            // the new count
            total = count + 1;
        } else {
            // new 
            total = 1L;
        }

        AppDownloadedCount appDownalodedCount = AppDownloadedCount.builder()
                .appId(event.getAppId())
                .downloadCount(total)
                .build();

        log.info("Increase the AppDownloadedCount: {}", appDownalodedCount);
        // update
        appDownloadedCommandRepository.save(appDownalodedCount);
    }

}
