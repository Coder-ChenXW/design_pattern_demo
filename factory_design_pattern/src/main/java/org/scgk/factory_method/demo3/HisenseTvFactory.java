package org.scgk.factory_method.demo3;

public class HisenseTvFactory implements TvFactory {
    @Override
    public TV createTv() {
        System.out.println("海信生产");
        return new Hisense();
    }
}
