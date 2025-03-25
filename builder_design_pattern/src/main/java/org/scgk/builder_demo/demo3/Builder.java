package org.scgk.builder_demo.demo3;

public abstract class Builder {

    protected  Car car = new Car();

    public abstract void buildSteering();
    public abstract void buildTyre();
    public abstract void buildEngine();

    public abstract Car createCar();

}
