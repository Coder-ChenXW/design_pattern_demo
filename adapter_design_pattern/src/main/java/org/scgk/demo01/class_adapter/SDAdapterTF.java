package org.scgk.demo01.class_adapter;

public class SDAdapterTF extends TFCardImpl implements SDCard {

    @Override
    public String readSD() {
        System.out.println("adapter read tfCard");
        return readTF();
    }

    @Override
    public void writeSD(String msg) {
        System.out.println("adapter write tfCard");
        writeTF(msg);
    }
}
