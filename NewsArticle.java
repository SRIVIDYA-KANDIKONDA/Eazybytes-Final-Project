package com.newsaggregator.model;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class NewsArticle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    private String source;
    private String url;
    private LocalDateTime publishedAt;
    // Getters and Setters
}
