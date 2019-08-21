package com.github.bosik927.decorator.common;

import com.github.bosik927.decorator.common.datasource.boundary.DataSource;
import com.github.bosik927.decorator.common.datasource.control.CompressionDecorator;
import com.github.bosik927.decorator.common.datasource.control.DataSourceDecorator;
import com.github.bosik927.decorator.common.datasource.control.EncryptionDecorator;
import com.github.bosik927.decorator.common.datasource.control.FileDataSource;

public class Demo {
    public static void main(String[] args) {
        String salaryRecords = "Name,Salary\nJohn Smith,100000\nSteven Jobs,912000";
        DataSourceDecorator encoded = new CompressionDecorator(
                new EncryptionDecorator(
                        new FileDataSource("out/OutputDemo.txt")));
        encoded.writeData(salaryRecords);
        DataSource plain = new FileDataSource("out/OutputDemo.txt");

        System.out.println("- Input ----------------");
        System.out.println(salaryRecords);
        System.out.println("- Encoded --------------");
        System.out.println(plain.readData());
        System.out.println("- Decoded --------------");
        System.out.println(encoded.readData());
    }
}