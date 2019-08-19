package com.github.bosik927.nullobject.sample;

import java.io.PrintStream;

class NullPrintStream extends PrintStream {

    public NullPrintStream() {
        super(new NullOutputStream());
    }
}

