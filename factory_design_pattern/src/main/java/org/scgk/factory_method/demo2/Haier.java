package org.scgk.factory_method.demo2;

public class Haier implements TV {

    @Override
    public void produce() {
        System.out.printf("生产海尔电视");
    }
}
