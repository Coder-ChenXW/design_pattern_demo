package org.scgk.demo01.cglib_proxy;

public class Client {

    public static void main(String[] args) {

        ProxyFactory factory = new ProxyFactory();
        TrainStation proxyObject = factory.getProxyObject();
        proxyObject.sell();

    }

}
