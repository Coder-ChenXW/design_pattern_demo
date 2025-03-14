package org.scgk.abstract_factory.demo2;

public class TclAirConditioner implements AirConditioner {
    @Override
    public void display() {
        System.out.println("Tcl空调启动...");
    }
}
