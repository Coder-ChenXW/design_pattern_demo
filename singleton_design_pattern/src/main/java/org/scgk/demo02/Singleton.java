package org.scgk.demo02;

public class Singleton {

    private Singleton(){

    }

    private static Singleton instance;

    static {
        instance = new Singleton();
    }

    public static Singleton getInstance(){
        return instance;
    }

}
