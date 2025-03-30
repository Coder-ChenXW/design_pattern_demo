package org.scgk.demo01;

public class SmartAppliancesFacade {

    private Light light;
    private Tv tv;
    private AirCondition airCondition;

    public SmartAppliancesFacade() {
        light= new Light();
        tv = new Tv();
        airCondition = new AirCondition();
    }

    public void say(String msg){
        if (msg.contains("打开")){
            on();
        }else if (msg.contains("关闭")){
            off();
        }else {
            System.out.println("我还听不懂你说打");
        }
    }

    private void on(){
        light.on();
        tv.on();
        airCondition.on();
    }

    private void off(){
        light.off();
        tv.off();
        airCondition.off();
    }

}
