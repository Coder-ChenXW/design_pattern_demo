package org.scgk.demo5;

public class PrototypeTest {

    public static void main(String[] args) {

        ConcretePrototype prototype = new ConcretePrototype();
        prototype.setAttr("Sunny");
        ConcretePrototype copy = (ConcretePrototype) prototype.clone();
        System.out.println(prototype==copy);

    }

}
