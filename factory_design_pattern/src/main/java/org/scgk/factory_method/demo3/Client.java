package org.scgk.factory_method.demo3;

public class Client {

    public static void main(String[] args) {

        TvFactory factory = new HaierTvFactory();
        factory.createTv().play();

    }

}
