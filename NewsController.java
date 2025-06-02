package com.newsaggregator.controller;

import com.newsaggregator.model.NewsArticle;
import com.newsaggregator.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/news")
@CrossOrigin
public class NewsController {
    @Autowired
    private NewsService newsService;

    @GetMapping
    public List<NewsArticle> getAllNews() {
        return newsService.getAllArticles();
    }
}
