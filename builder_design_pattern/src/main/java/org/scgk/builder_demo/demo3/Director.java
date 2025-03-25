package org.scgk.builder_demo.demo3;


public class Director {

    private Builder builder;

    public Director(Builder builder){
        this.builder=builder;
    }

    public Car construct(){
        builder.buildSteering();
        builder.buildTyre();
        builder.buildEngine();
        return builder.createCar();
    }

}
