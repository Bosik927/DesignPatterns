package com.github.bosik927.observer.common.channels;

public class NewsChannel implements Channel {

    private String news;

    public NewsChannel(String news) {
        this.news = news;
    }

    @Override
    public void update(Object news) {
        setNews((String) news);
    }

    public String getNews() {
        return news;
    }

    public void setNews(String news) {
        this.news = news;
    }
}