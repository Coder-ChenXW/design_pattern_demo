package org.scgk.factory_method.demo2;

public class Hisense implements TV {
    @Override
    public void produce() {
        System.out.println("生产海信电视");
    }
}
