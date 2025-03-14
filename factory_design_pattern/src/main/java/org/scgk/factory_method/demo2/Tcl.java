package org.scgk.factory_method.demo2;

public class Tcl implements TV {
    @Override
    public void produce() {
        System.out.println("生产tcl电视");
    }
}
