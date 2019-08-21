package com.github.bosik927.proxy.common.youtube.control;

import com.github.bosik927.proxy.common.youtube.boundary.ThirdPartyYoutubeLib;
import com.github.bosik927.proxy.common.youtube.entity.Video;

import java.util.HashMap;

public class YoutubeCacheProxy implements ThirdPartyYoutubeLib {

    private ThirdPartyYoutubeLib youtubeService;
    private HashMap<String, Video> cachePopular = new HashMap<>();
    private HashMap<String, Video> cacheAll = new HashMap<>();

    public YoutubeCacheProxy() {
        this.youtubeService = new ThirdPartyYoutubeClass();
    }

    @Override
    public HashMap<String, Video> popularVideos() {
        if (cachePopular.isEmpty()) {
            cachePopular = youtubeService.popularVideos();
        } else {
            System.out.println("Retrieved list from cache.");
        }
        return cachePopular;
    }

    @Override
    public Video getVideo(String videoId) {
        Video video = cacheAll.get(videoId);
        if (video == null) {
            video = youtubeService.getVideo(videoId);
            cacheAll.put(videoId, video);
        } else {
            System.out.println("Retrieved video '" + videoId + "' from cache.");
        }
        return video;
    }

    public void reset() {
        cachePopular.clear();
        cacheAll.clear();
    }
}