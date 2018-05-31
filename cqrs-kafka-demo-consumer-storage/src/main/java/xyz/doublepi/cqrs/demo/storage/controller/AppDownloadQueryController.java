package xyz.doublepi.cqrs.demo.storage.controller;

import xyz.doublepi.cqrs.demo.storage.model.AppDownload;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import xyz.doublepi.cqrs.demo.storage.service.AppDownloadQueryService;

@RestController
@RequestMapping("/api/v3")
public class AppDownloadQueryController {

    @Autowired
    private AppDownloadQueryService appDownloadQueryService;

    @GetMapping("/downloads")
    public List<AppDownload> findAll() {
        return appDownloadQueryService.findAll();
    }

    @GetMapping("/downloads/app/{appId}")
    public List<AppDownload> findByAppId(@PathVariable("appId") Long appId) {
        return appDownloadQueryService.findByAppId(appId);
    }

    @GetMapping("/downloads/user/{userId}")
    public List<AppDownload> findByUserId(@PathVariable("userId") Long userId) {
        return appDownloadQueryService.findByUserId(userId);
    }

    @GetMapping("/downloads/count/app/{appId}")
    @ResponseBody
    public Long countByAppId(@PathVariable("appId") Long appId) {
        return appDownloadQueryService.countByAppId(appId);
    }

    @GetMapping("/downloads/count/user/{userId}")
    @ResponseBody
    public Long countByUserId(@PathVariable("userId") Long userId) {
        return appDownloadQueryService.countByUserId(userId);
    }

}
