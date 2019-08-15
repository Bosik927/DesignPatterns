package com.github.bosik927.composite.sample.file;

import com.github.bosik927.composite.sample.CompositeDemo;

import java.util.ArrayList;
import java.util.List;

public class Directory implements AbstractFile {

    private String name;
    private List includedFiles = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    public void add(Object obj) {
        includedFiles.add(obj);
    }

    public void ls() {
        System.out.println(CompositeDemo.compositeBuilder + name);
        CompositeDemo.compositeBuilder.append("   ");
        for (Object includedFile : includedFiles) {
            AbstractFile obj = (AbstractFile) includedFile;
            obj.ls();
        }
        CompositeDemo.compositeBuilder.setLength(CompositeDemo.compositeBuilder.length() - 3);
    }
}