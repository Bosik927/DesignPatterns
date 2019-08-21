package com.github.bosik927.facade.common.video.entity;

import java.io.File;

public class AudioMixer {

    public File fix(VideoFile result){
        System.out.println("AudioMixer: fixing audio...");
        return new File("tmp");
    }
}