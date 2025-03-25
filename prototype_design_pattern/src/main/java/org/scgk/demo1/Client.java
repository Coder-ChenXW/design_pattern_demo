package org.scgk.demo1;

public class Client {

    public static void main(String[] args) throws Exception {

        Realizetype realizetype = new Realizetype();
        Realizetype clone = realizetype.clone();

        System.out.println("原型对象和克隆出来的是否是同一个对象...:"+(realizetype==clone));

    }

}
