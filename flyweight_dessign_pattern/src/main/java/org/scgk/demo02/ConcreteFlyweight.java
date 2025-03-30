package org.scgk.demo02;

public class ConcreteFlyweight implements Flyweight {

    private String intrinsicState;

    public ConcreteFlyweight(String intrinsicState){
        this.intrinsicState = intrinsicState;
    }

    @Override
    public void operation(String extrinsicState) {
        System.out.println("内部状态："+intrinsicState);
        System.out.println("外部状态："+extrinsicState);
    }
}
