package org.scgk.factory_method.demo2;

public class Skyworth implements TV {
    @Override
    public void produce() {
        System.out.println("生产创维电视");
    }
}
