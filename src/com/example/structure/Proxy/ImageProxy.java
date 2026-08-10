package com.example.structure.Proxy;

public class ImageProxy implements Image{
    private final String filename;
    private HighResImage realImage;

    public ImageProxy(String filename){
        this.filename = filename;
    }

    @Override
    public void display() {
        if (realImage == null) {
            realImage = new HighResImage(filename);
        }
        realImage.display();
    }
}
