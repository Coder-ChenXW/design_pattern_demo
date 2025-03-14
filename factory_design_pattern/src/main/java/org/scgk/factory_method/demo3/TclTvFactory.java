package org.scgk.factory_method.demo3;

public class TclTvFactory implements TvFactory {
    @Override
    public TV createTv() {
        System.out.println("tcl生产");
        return new Tcl();
    }
}
