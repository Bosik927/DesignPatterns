package com.github.bosik927.composite.sample.file;

import com.github.bosik927.composite.sample.CompositeDemo;

public class File implements AbstractFile {

    private String name;

    public File(String name) {
        this.name = name;
    }

    public void ls() {
        System.out.println(CompositeDemo.compositeBuilder + name);
    }
}