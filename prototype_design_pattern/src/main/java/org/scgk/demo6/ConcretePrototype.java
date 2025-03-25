package org.scgk.demo6;

import lombok.Data;
import org.scgk.demo5.Prototype;

@Data
public class ConcretePrototype implements Cloneable {

    private String attr;

    @Override
    public Prototype clone() {
        Object object = null;
        try {
            object = super.clone();
        }catch (Exception e){
            System.out.println("not support");
        }
        return (Prototype) object;
    }
}
