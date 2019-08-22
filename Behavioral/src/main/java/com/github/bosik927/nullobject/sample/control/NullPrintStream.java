package com.github.bosik927.nullobject.sample.control;

import java.io.PrintStream;

public class NullPrintStream extends PrintStream {

    public NullPrintStream() {
        super(new NullOutputStream());
    }
}

