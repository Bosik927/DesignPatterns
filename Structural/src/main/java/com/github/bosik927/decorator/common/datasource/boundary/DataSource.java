package com.github.bosik927.decorator.common.datasource.boundary;

public interface DataSource {

    void writeData(String data);

    String readData();
}