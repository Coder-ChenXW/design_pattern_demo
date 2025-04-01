package org.scgk.demo01.static_proxy;

public class ProxyPoint implements SellTickets {

    private TrainStation trainStation = new TrainStation();

    @Override
    public void sell() {
        System.out.println("代理收取一些服务费用");
        trainStation.sell();
    }
}
