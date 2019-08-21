package com.github.bosik927.composite.sample.file.control;

import com.github.bosik927.composite.sample.CompositeDemo;
import com.github.bosik927.composite.sample.file.boundary.AbstractFile;

import java.util.ArrayList;
import java.util.List;

public class Directory implements AbstractFile {

    private String name;
    private List<AbstractFile> includedFiles = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    public void add(AbstractFile file) {
        includedFiles.add(file);
    }

    public void ls() {
        System.out.println(CompositeDemo.compositeBuilder + name);
        CompositeDemo.compositeBuilder.append("   ");
        for (Object includedFile : includedFiles) {
            AbstractFile file = (AbstractFile) includedFile;
            file.ls();
        }
        CompositeDemo.compositeBuilder.setLength(CompositeDemo.compositeBuilder.length() - 3);
    }
}