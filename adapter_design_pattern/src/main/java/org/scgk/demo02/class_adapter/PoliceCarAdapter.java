package org.scgk.demo02.class_adapter;

public class PoliceCarAdapter extends CarController {

    private PoliceSound sound;
    private PoliceLamp lamp;

    public PoliceCarAdapter() {
        this.sound = new PoliceSound();
        this.lamp = new PoliceLamp();
    }

    @Override
    public void move() {
        System.out.println("移动中...");
    }

    public void phonate(){
        sound.alarSound();
    }

    public void twinkle(){
        lamp.alarmLamp();
    }

}
