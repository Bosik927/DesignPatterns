package com.github.bosik927.factorymethod.sample.reader.control;

import com.github.bosik927.factorymethod.sample.reader.boundary.ImageReader;
import com.github.bosik927.factorymethod.sample.reader.entity.DecodedImage;

public class JpegReader implements ImageReader {

    private DecodedImage decodedImage;

    public JpegReader(String image) {
        decodedImage = new DecodedImage(image);
    }

    @Override
    public DecodedImage getDecodeImage() {
        return decodedImage;
    }
}