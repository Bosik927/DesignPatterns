package com.github.bosik927.proxy.common.youtube.boundary;

import com.github.bosik927.proxy.common.youtube.entity.Video;

import java.util.HashMap;

public interface ThirdPartyYoutubeLib {

    HashMap<String, Video> popularVideos();

    Video getVideo(String videoId);
}