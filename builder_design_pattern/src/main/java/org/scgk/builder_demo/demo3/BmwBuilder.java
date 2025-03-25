package org.scgk.builder_demo.demo3;

public class BmwBuilder extends Builder {


    @Override
    public void buildSteering() {
        car.setSteering("宝马方向盘");
    }

    @Override
    public void buildTyre() {
        car.setTyre("宝马轮胎");
    }

    @Override
    public void buildEngine() {
        car.setEngine("宝马v8发送机");
    }

    @Override
    public Car createCar() {
        return car;
    }
}
