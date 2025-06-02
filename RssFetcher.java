package com.newsaggregator.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class RssFetcher {
    @Scheduled(fixedRate = 3600000) // every hour
    public void fetchRssFeeds() {
        // Logic to fetch and save RSS feeds
    }
}
