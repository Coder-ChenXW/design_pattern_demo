package org.scgk.builder_demo.demo3;

public class Client {

    public static void main(String[] args) {

        Director director = new Director(new BmwBuilder());
        Car car = director.construct();
        System.out.println(car.getSteering());
        System.out.println(car.getTyre());
        System.out.println(car.getEngine());

        System.out.println(car);

    }

}
