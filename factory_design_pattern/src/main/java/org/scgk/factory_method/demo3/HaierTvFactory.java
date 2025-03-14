package org.scgk.factory_method.demo3;

public class HaierTvFactory implements TvFactory {
    @Override
    public TV createTv() {
        System.out.println("海尔生产");
        return new Haier();
    }
}
