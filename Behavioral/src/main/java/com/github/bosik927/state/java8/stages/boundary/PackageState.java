package com.github.bosik927.state.java8.stages.boundary;

import com.github.bosik927.state.java8.stages.entity.Package;

public interface PackageState {

    void next(Package pkg);

    void prev(Package pkg);

    void printStatus();
}