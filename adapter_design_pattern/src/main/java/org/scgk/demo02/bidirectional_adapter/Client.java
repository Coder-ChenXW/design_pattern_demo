package org.scgk.demo02.bidirectional_adapter;

public class Client {

    public static void main(String[] args) {

        Adaptee adaptee = new ConcreteAdaptee();
        Adapter adapter1 = new Adapter(adaptee);
        adapter1.request();

        Target target = new ConcreteTarget();
        Adapter adapter2 = new Adapter(target);
        adapter2.specificRequest();

    }

}
