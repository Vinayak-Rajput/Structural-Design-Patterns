package com.example.structure.Composite;

public class File implements FileSystemElement{
    private final int size;

    public File(int size){
        this.size =size;
    }

    @Override
    public int getSize() {
        return size;
    }
}
