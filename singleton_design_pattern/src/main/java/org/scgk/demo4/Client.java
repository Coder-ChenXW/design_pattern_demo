package org.scgk.demo4;

public class Client {

    public static void main(String[] args) {

        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();

        System.out.println(instance==instance2);

    }

}
