package com.github.bosik927.proxy.common.youtube.entity;

public class Video {

    public String id;
    public String title;
    public String data;

    public Video(String id, String title) {
        this.id = id;
        this.title = title;
        this.data = "Random video.";
    }
}