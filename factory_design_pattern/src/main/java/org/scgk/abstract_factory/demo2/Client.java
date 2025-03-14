package org.scgk.abstract_factory.demo2;

public class Client {

    public static void main(String[] args) {

        Factory haierFactory = new HaierFactory();
        Tv tv = haierFactory.createTv();
        AirConditioner airConditioner = haierFactory.createAirConditioner();
        Icebox icebox = haierFactory.createIcebox();

        tv.display();
        airConditioner.display();
        icebox.display();




    }

}
