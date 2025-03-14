package org.scgk.abstract_factory.demo2;

public class HisenseFactory implements Factory {
    @Override
    public Tv createTv() {
        return new HisenseTv();
    }

    @Override
    public Icebox createIcebox() {
        return new HisenseIceBox();
    }

    @Override
    public AirConditioner createAirConditioner() {
        return new HaierAirConditioner();
    }
}
