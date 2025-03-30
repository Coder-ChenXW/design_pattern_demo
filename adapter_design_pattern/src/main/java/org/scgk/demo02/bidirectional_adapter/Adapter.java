package org.scgk.demo02.bidirectional_adapter;

public class Adapter implements Target,Adaptee {

    private Target target;
    private Adaptee adaptee;

    public Adapter(Target target){
        this.target=target;
    }

    public Adapter(Adaptee adaptee){
        this.adaptee=adaptee;
    }


    @Override
    public void specificRequest() {
        if (adaptee!=null){
            adaptee.specificRequest();
        }
    }

    @Override
    public void request() {
        if (target!=null){
            target.request();
        }
    }
}
