package com.github.bosik927.nullobject.sample;

import java.io.OutputStream;

class NullOutputStream extends OutputStream {

    public NullOutputStream() {
    }

    public void write(int b) {
        // Do nothing
    }
}