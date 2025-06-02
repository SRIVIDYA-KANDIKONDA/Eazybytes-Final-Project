package com.newsaggregator.service;

import com.newsaggregator.model.NewsArticle;
import com.newsaggregator.repository.NewsArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class NewsService {
    @Autowired
    private NewsArticleRepository repository;

    public List<NewsArticle> getAllArticles() {
        return repository.findAll();
    }

    public void saveArticles(List<NewsArticle> articles) {
        repository.saveAll(articles);
    }
}
