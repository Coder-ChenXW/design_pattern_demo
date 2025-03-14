package org.scgk.factory_method.demo1;

public class Client {
    public static void main(String[] args) {
        Factory factory = new ConncreteProduct();
        Product product = factory.factoryMethod();
    }
}
