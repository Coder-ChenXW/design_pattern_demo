package org.scgk.demo2;

public class ConcreteDecorator extends Decorator {

    public ConcreteDecorator(Component component) {
        super(component);
    }

    public void operation(){
        super.operation();
        addedBehavior();
    }

    public void addedBehavior(){
        System.out.println("addedBehavior...");
    }

}
