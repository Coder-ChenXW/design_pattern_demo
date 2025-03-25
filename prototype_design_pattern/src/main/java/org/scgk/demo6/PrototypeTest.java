package org.scgk.demo6;


import org.scgk.demo5.ConcretePrototype;
import org.scgk.demo5.Prototype;

public class PrototypeTest {

    public static void main(String[] args) {

        ConcretePrototype concretePrototype = new ConcretePrototype();
        Prototype copy = concretePrototype.clone();
        System.out.println(concretePrototype==copy);

    }

}
