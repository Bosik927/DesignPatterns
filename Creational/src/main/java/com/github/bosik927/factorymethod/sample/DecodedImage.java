package com.github.bosik927.factorymethod.sample;

class DecodedImage {

    private String image;

    public DecodedImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return image + ": is decoded";
    }
}