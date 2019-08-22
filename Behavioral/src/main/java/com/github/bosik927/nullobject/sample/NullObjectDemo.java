package com.github.bosik927.nullobject.sample;

import com.github.bosik927.nullobject.sample.control.Application;
import com.github.bosik927.nullobject.sample.control.NullPrintStream;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class NullObjectDemo {

    public static void main(String[] args) throws FileNotFoundException {
        Application app = new Application(new NullPrintStream());
        app.doSomething();

        Application app2 = new Application(new PrintStream("NotNull"));
        app2.doSomething();
    }
}