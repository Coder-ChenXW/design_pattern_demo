package org.scgk.abstract_factory.demo3;

public class SpringTextField implements TextField {
    @Override
    public void display() {
        System.out.println("显示绿色边框文本框");
    }
}
