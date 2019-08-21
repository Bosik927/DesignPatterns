package com.github.bosik927.facade.common.codec.control;

import com.github.bosik927.facade.common.video.entity.VideoFile;
import com.github.bosik927.facade.common.codec.boundary.Codec;

public class CodecFactory {

    public static Codec extract(VideoFile file) {
        String type = file.getCodecType();
        if (type.equals("mp4")) {
            System.out.println("CodecFactory: extracting mpeg audio...");
            return new MPEG4CompressionCodec();
        }
        else {
            System.out.println("CodecFactory: extracting ogg audio...");
            return new OggCompressionCodec();
        }
    }
}