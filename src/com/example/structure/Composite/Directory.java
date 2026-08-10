package com.example.structure.Composite;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystemElement {
    private final List<FileSystemElement> elements = new ArrayList<>();

    public void add(FileSystemElement element){
        elements.add(element);
    }

    @Override
    public int getSize() {
        return elements.stream().mapToInt(FileSystemElement::getSize).sum();
    }
}
