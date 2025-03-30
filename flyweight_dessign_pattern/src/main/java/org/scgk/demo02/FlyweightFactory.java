package org.scgk.demo02;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {


    private Map<String,Flyweight> flyweights = new HashMap();

    public Flyweight getFlyweight(String key){
        if (flyweights.containsKey(key)){
            return (Flyweight) flyweights.get(key);
        }else {
            Flyweight fw = new ConcreteFlyweight(key);
            flyweights.put(key,fw);
            return fw;
        }
    }

}
