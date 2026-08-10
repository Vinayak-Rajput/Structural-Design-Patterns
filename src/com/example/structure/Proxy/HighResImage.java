package com.example.structure.Proxy;

public class HighResImage implements Image{ // Real Subject

    private final String filename;

    public HighResImage(String filename) {
        this.filename = filename;
        loadFromDisk(); // Expensive operation
    }

    private void loadFromDisk() {
        System.out.println("Loading heavy image asset from disk: "+ filename);
    }

    @Override
    public void display() {
        System.out.println("Displaying " +filename);
    }
}
