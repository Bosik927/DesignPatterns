package com.github.bosik927.facade.common.video.control;

import com.github.bosik927.facade.common.codec.boundary.Codec;
import com.github.bosik927.facade.common.codec.control.CodecFactory;
import com.github.bosik927.facade.common.codec.control.MPEG4CompressionCodec;
import com.github.bosik927.facade.common.codec.control.OggCompressionCodec;
import com.github.bosik927.facade.common.video.entity.AudioMixer;
import com.github.bosik927.facade.common.video.entity.BitrateReader;
import com.github.bosik927.facade.common.video.entity.VideoFile;

import java.io.File;

public class VideoConversionFacade {

    public File convertVideo(String fileName, String format) {
        System.out.println("VideoConversionFacade: conversion started.");
        VideoFile file = new VideoFile(fileName);
        Codec sourceCodec = CodecFactory.extract(file);
        Codec destinationCodec;
        if (format.equals("mp4")) {
            destinationCodec = new OggCompressionCodec();
        } else {
            destinationCodec = new MPEG4CompressionCodec();
        }
        VideoFile buffer = BitrateReader.read(file, sourceCodec);
        VideoFile intermediateResult = BitrateReader.convert(buffer, destinationCodec);
        File result = (new AudioMixer()).fix(intermediateResult);
        System.out.println("VideoConversionFacade: conversion completed.");
        return result;
    }
}