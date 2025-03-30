package org.scgk.demo02;

public abstract class WritingBrush {

    protected Color color;

    public WritingBrush(Color color){
        this.color=color;
    }

    public abstract void drawing(String draw);

}
