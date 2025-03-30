package org.scgk.demo02;

public class UnsharedConcreteFlyweight implements Flyweight {

    private String allState;

    public UnsharedConcreteFlyweight(String allState){
        this.allState=allState;
    }

    @Override
    public void operation(String extrinsicState) {
        System.out.println("所有状态："+allState);
        System.out.println("外部状态:"+extrinsicState);
    }
}
