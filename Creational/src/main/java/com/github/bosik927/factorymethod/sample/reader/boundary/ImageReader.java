package com.github.bosik927.factorymethod.sample.reader.boundary;

import com.github.bosik927.factorymethod.sample.reader.entity.DecodedImage;

public interface ImageReader {
    DecodedImage getDecodeImage();
}