package org.scgk.demo02.bidirectional_adapter;

public class ConcreteAdaptee implements Adaptee {

    @Override
    public void specificRequest() {
        System.out.println("ConcreteAdaptee...");
    }
}
