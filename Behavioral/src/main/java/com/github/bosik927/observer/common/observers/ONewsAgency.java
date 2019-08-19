package com.github.bosik927.observer.common.observers;

import java.util.Observable;

public class ONewsAgency  extends Observable {

    private String news;

    public void setNews(String news) {
        this.news = news;
        setChanged();
        notifyObservers(news);
    }
}