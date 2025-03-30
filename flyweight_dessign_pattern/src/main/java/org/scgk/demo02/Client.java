package org.scgk.demo02;

public class Client {

    public static void main(String[] args) {

        FlyweightFactory factory = new FlyweightFactory();

        Flyweight flyweight1 = factory.getFlyweight("key1");
        Flyweight flyweight2 = factory.getFlyweight("key1");

        System.out.println(flyweight1==flyweight2);

        flyweight1.operation("外部");

        UnsharedConcreteFlyweight unsharedConcreteFlyweight = new UnsharedConcreteFlyweight("非公共");

        unsharedConcreteFlyweight.operation("外部状态");
    }

}
