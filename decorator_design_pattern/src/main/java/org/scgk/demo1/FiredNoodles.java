package org.scgk.demo1;

public class FiredNoodles extends FastFood {

    public FiredNoodles(){
        super(12,"炒面");
    }

    @Override
    public float cost() {
        return getPrice();
    }
}
