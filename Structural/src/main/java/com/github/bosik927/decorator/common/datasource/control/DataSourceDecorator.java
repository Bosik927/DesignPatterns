package com.github.bosik927.decorator.common.datasource.control;

import com.github.bosik927.decorator.common.datasource.boundary.DataSource;

public class DataSourceDecorator implements DataSource {

    private DataSource wrapper;

    public DataSourceDecorator(DataSource source) {
        this.wrapper = source;
    }

    @Override
    public void writeData(String data) {
        wrapper.writeData(data);
    }

    @Override
    public String readData() {
        return wrapper.readData();
    }
}