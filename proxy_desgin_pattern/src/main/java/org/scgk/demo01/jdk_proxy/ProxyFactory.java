package org.scgk.demo01.jdk_proxy;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyFactory {

    private TrainStation station = new TrainStation();

    public SellTickets getProxyObject() {
        SellTickets proxyObject = (SellTickets) Proxy.newProxyInstance(
                station.getClass().getClassLoader(),
                station.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//                        System.out.println("invoke方法执行了...");
                        Object obj = method.invoke(station, args);
                        return obj;
                    }
                }
        );
        return proxyObject;
    }

}
