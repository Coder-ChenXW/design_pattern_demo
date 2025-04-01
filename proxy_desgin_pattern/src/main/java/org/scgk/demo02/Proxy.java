package org.scgk.demo02;

public class Proxy extends Subject{

    private RealSubject realSubject = new RealSubject();

    public void preRequest(){
        System.out.println("Proxy preRequest...");
    }

    @Override
    public void request() {
        preRequest();
        realSubject.request();
        postRequest();
    }

    public void postRequest(){
        System.out.println("Proxy postRequest");
    }

}
