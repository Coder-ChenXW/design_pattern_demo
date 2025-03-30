package org.scgk.demo02.bidirectional_adapter;

public class ConcreteTarget implements Target {
    @Override
    public void request() {
        System.out.println("ConcreteTarget...");
    }
}
