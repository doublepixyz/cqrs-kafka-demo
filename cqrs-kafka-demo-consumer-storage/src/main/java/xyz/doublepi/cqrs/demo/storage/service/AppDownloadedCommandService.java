/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xyz.doublepi.cqrs.demo.storage.service;

import xyz.doublepi.cqrs.demo.storage.model.AppDownload;
import xyz.doublepi.cqrs.demo.storage.model.DownloadEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.doublepi.cqrs.demo.storage.repository.AppDownloadCommandRepository;
import lombok.extern.slf4j.Slf4j;

/**
 *
 * @author pi314
 */
@Service
@Slf4j
public class AppDownloadedCommandService {

    @Autowired
    private AppDownloadCommandRepository appDownloadCommandRepository;

    public AppDownload save(DownloadEvent downloadEvent) {
        AppDownload appDownload = AppDownload.builder()
                .appId(downloadEvent.getAppId())
                .userId(downloadEvent.getUserId())
                .timestamp(downloadEvent.getTimestamp())
                .build();

        log.info("Saved as  AppDownload: {}", appDownload);
        // save
        return appDownloadCommandRepository.save(appDownload);
    }

}
