package org.scgk.demo01.static_proxy;

public class TrainStation implements SellTickets {
    @Override
    public void sell() {
        System.out.println("火车票卖票...");
    }
}
