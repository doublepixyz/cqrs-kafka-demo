/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xyz.doublepi.cqrs.demo.cache.service;

import xyz.doublepi.cqrs.demo.cache.model.AppDownloadedCount;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.doublepi.cqrs.demo.cache.repository.AppDownloadedQueryRepository;

/**
 *
 * @author pi314
 */
@Service
public class AppDownloadedCountQueryService {

    @Autowired
    private AppDownloadedQueryRepository appDownloadedQueryRepository;

    public List<AppDownloadedCount> findAll() {
        List<AppDownloadedCount> downloads = new ArrayList<>();
        appDownloadedQueryRepository.findAll().forEach(downloads::add);
        return downloads;
    }

    public Long countByAppId(Long appId) {
        Optional<AppDownloadedCount> o = appDownloadedQueryRepository.findById(appId);
        if (o.isPresent()) {
            return o.get().getDownloadCount();
        } else {
            return 0L;
        }
    }

}
