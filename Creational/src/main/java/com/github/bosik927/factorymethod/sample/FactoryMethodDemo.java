package com.github.bosik927.factorymethod.sample;


import com.github.bosik927.factorymethod.sample.reader.boundary.ImageReader;
import com.github.bosik927.factorymethod.sample.reader.control.GifReader;
import com.github.bosik927.factorymethod.sample.reader.control.JpegReader;
import com.github.bosik927.factorymethod.sample.reader.entity.DecodedImage;

public class FactoryMethodDemo {

    public static void main(String[] args) {
        DecodedImage decodedImage;
        ImageReader reader = null;
        String image = "costam.jpeg";
        String format = image.substring(image.indexOf('.') + 1);

        if (format.equals("gif")) {
            reader = new GifReader(image);
        }else if (format.equals("jpeg")) {
            reader = new JpegReader(image);
        }
        assert reader != null;
        decodedImage = reader.getDecodeImage();
        System.out.println(decodedImage);
    }
}