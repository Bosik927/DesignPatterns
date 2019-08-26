package com.github.bosik927.templateclass.java8;

import com.github.bosik927.templateclass.java8.boundary.ComputerBuilder;
import com.github.bosik927.templateclass.java8.control.HighEndComputerBuilder;
import com.github.bosik927.templateclass.java8.control.StandardComputerBuilder;
import com.github.bosik927.templateclass.java8.entity.Computer;

public class TemplateDemo {

    public static void main(String... args){
        ComputerBuilder standardComputerBuilder = new StandardComputerBuilder();
        Computer standardComputer = standardComputerBuilder.buildComputer();
        standardComputer.getComputerParts().forEach((k, v) -> System.out.println("Part : " + k + " Value : " + v));

        System.out.println();

        ComputerBuilder highEndComputerBuilder = new HighEndComputerBuilder();
        Computer highEndComputer = highEndComputerBuilder.buildComputer();
        highEndComputer.getComputerParts().forEach((k, v) -> System.out.println("Part : " + k + " Value : " + v));
    }
}