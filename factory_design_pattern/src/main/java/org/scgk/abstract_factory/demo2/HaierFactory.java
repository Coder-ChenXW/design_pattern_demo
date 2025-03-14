package org.scgk.abstract_factory.demo2;

public class HaierFactory implements Factory {


    @Override
    public Tv createTv() {
        System.out.println("生产海尔电视...");
        return new HaierTv();
    }

    @Override
    public Icebox createIcebox() {
        System.out.println("生产海尔冰箱...");
        return new HaierIceBox();
    }

    @Override
    public AirConditioner createAirConditioner() {
        System.out.println("生产海尔空调...");
        return new HaierAirConditioner();
    }
}
