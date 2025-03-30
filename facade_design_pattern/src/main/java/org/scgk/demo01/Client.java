package org.scgk.demo01;

public class Client {

    public static void main(String[] args) {

        SmartAppliancesFacade facade = new SmartAppliancesFacade();
        facade.say("打开");
        System.out.println("*********************");
        facade.say("关闭");

    }

}
