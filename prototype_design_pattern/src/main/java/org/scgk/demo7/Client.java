package org.scgk.demo7;


public class Client {
    public static void main(String[] args) {
        Email email=new Email();

        Email copyEmail=(Email)email.clone();

        System.out.println(email==copyEmail);

        System.out.println(email.getAttachment()==copyEmail.getAttachment());
    }
}