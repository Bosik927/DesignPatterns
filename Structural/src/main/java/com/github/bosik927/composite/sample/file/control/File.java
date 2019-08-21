package com.github.bosik927.composite.sample.file.control;

import com.github.bosik927.composite.sample.CompositeDemo;
import com.github.bosik927.composite.sample.file.boundary.AbstractFile;

public class File implements AbstractFile {

    private String name;

    public File(String name) {
        this.name = name;
    }

    public void ls() {
        System.out.println(CompositeDemo.compositeBuilder + name);
    }
}