package com.github.bosik927.factorymethod.sample.reader.control;

import com.github.bosik927.factorymethod.sample.reader.boundary.ImageReader;
import com.github.bosik927.factorymethod.sample.reader.entity.DecodedImage;

public class GifReader implements ImageReader {

    private DecodedImage decodedImage;

    public GifReader(String image) {
        this.decodedImage = new DecodedImage(image);
    }

    @Override
    public DecodedImage getDecodeImage() {
        return decodedImage;
    }
}