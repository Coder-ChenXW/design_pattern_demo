package org.scgk.factory_method.demo1;

public class ConncreteProduct implements Factory {
    @Override
    public Product factoryMethod() {
        return new Product();
    }
}
