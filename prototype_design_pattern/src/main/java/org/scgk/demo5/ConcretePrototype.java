package org.scgk.demo5;

import lombok.Data;

@Data
public class ConcretePrototype implements Prototype {

    private String attr;

    @Override
    public Prototype clone() {
        ConcretePrototype prototype = new ConcretePrototype();
        prototype.setAttr(this.attr);
        return prototype;
    }
}
