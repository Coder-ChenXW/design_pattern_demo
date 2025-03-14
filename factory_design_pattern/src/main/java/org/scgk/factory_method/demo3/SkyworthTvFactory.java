package org.scgk.factory_method.demo3;

public class SkyworthTvFactory implements TvFactory {
    @Override
    public TV createTv() {
        System.out.println("创维生产");
        return new Skyworth();
    }
}
