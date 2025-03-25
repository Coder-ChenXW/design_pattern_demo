package org.scgk.builder_demo.demo3;

public class BenzBuilder extends Builder {


    @Override
    public void buildSteering() {
        car.setSteering("奔驰方向盘");
    }

    @Override
    public void buildTyre() {
        car.setTyre("奔驰轮胎");
    }

    @Override
    public void buildEngine() {
        car.setEngine("奔驰v8发送机");
    }

    @Override
    public Car createCar() {
        return car;
    }
}
