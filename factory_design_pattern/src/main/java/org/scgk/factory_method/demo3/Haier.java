package org.scgk.factory_method.demo3;

public class Haier implements TV {
    @Override
    public void play() {
        System.out.println("海尔播放");
    }
}
