package org.scgk.demo01.jdk_proxy;

public class Client {

    public static void main(String[] args) {

        ProxyFactory factory = new ProxyFactory();
        SellTickets proxyObject = factory.getProxyObject();
        proxyObject.sell();

        System.out.println(proxyObject.getClass());

    }

}
