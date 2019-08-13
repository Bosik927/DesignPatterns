package com.github.bosik927.abstractfactory.sample;

public class Client {

    public static void main(String[] args) {
        CPU ember = AbstractFactory.getFactory(Architecture.EMBER).createCPU();
        System.out.println(ember);

        CPU enginola = AbstractFactory.getFactory(Architecture.ENGINOLA).createCPU();
        System.out.println(enginola);
    }
}