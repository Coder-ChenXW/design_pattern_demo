package org.scgk.demo8;

public class Client {
	public static void main(String[] args) {
		
		Email email=new Email();
		Email copyEmail = null;
		
		try{
		    copyEmail=(Email)email.deepClone();
		} catch(Exception e) {
	   		e.printStackTrace();
	    }	

		System.out.println(email==copyEmail);
		System.out.println(email.getAttachment()==copyEmail.getAttachment());
	}
}