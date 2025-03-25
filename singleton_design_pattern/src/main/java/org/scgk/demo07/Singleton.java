package org.scgk.demo07;

import java.io.Serializable;

public class Singleton implements Serializable {

    private Singleton(){

    }

    private static class SingletonHolder{
        private static Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance(){
        return SingletonHolder.INSTANCE;
    }

    public Object readResolve(){
        return SingletonHolder.INSTANCE;
    }

}
