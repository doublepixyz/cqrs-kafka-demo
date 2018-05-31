/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xyz.doublepi.cqrs.demo.storage.service;

import xyz.doublepi.cqrs.demo.storage.model.AppDownload;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.doublepi.cqrs.demo.storage.repository.AppDownloadedQueryRepository;

/**
 *
 * @author pi314
 */
@Service
public class AppDownloadQueryService {

    @Autowired
    private AppDownloadedQueryRepository downloadQueryRepository;

    public List<AppDownload> findAll() {
        return downloadQueryRepository.findAll();
    }

    public List<AppDownload> findByAppId(Long appId) {
        return downloadQueryRepository.findByAppId(appId);
    }

    public List<AppDownload> findByUserId(Long userId) {
        return downloadQueryRepository.findByUserId(userId);
    }

    public Long countByAppId(Long appId) {
        return downloadQueryRepository.countByAppId(appId);
    }

    public Long countByUserId(Long userId) {
        return downloadQueryRepository.countByUserId(userId);
    }
}
