package org.scgk.builder_demo.demo1;

// 指挥者类
public class Director {

    private Builder builder;

    public Director(Builder builder){
        this.builder = builder;
    }

    public Bike construct(){
        builder.buildFrame();
        builder.buildSeat();
        return builder.createBike();
    }

}
