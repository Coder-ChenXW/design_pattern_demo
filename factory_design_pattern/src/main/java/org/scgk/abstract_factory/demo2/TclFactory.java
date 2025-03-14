package org.scgk.abstract_factory.demo2;

public class TclFactory implements Factory {
    @Override
    public Tv createTv() {
        return new TclTv();
    }

    @Override
    public Icebox createIcebox() {
        return new TclIceBox();
    }

    @Override
    public AirConditioner createAirConditioner() {
        return new TclAirConditioner();
    }
}
