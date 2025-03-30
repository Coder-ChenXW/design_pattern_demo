package org.scgk.demo02.class_adapter;

public class Client {

    public static void main(String[] args) {

        CarController policeCar = new PoliceCarAdapter();

        policeCar.move();
        policeCar.phonate();
        policeCar.twinkle();

    }

}
