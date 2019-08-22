package com.github.bosik927.nullobject.sample.control;

import java.io.OutputStream;

public class NullOutputStream extends OutputStream {

    public NullOutputStream() {
    }

    public void write(int b) {
        // Do nothing
    }
}