package xyz.doublepi.cqrs.demo.cache.controller;

import xyz.doublepi.cqrs.demo.cache.model.AppDownloadedCount;
import xyz.doublepi.cqrs.demo.cache.service.AppDownloadedCountQueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v3/cache")
public class AppDownloadedCountQueryController {

    @Autowired
    private AppDownloadedCountQueryService appDownloadedQueryService;

    @GetMapping("/downloads")
    public List<AppDownloadedCount> findAll() {
        return appDownloadedQueryService.findAll();
    }

    @GetMapping("/downloads/count/app/{app_id}")
    @ResponseBody
    public Long countByAppId(@PathVariable("app_id") Long appId) {
        return appDownloadedQueryService.countByAppId(appId);
    }

}
