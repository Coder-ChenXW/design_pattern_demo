package org.scgk.demo2;

public class Client {

    public static void main(String[] args) {

        Component component = new ConcreteComponent();

        component.operation();

        component = new ConcreteDecorator(component);
        System.out.println(component);

    }

}
