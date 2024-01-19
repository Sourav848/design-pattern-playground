package org.design.pattern.creational.builder;

public class Client {
	
	public static void main(String[] args) {
		
		//Builder pattern giving flexibility to handle complex objects 
		Phone phone = new PhoneBuilder().setOs("Android")
				      .setBrand("samsung")
				      .setBrand("galaxy")
				      .setRam("4GB")
				      .builder();//left storgecapacity field
		
		System.out.println(phone);
		
		System.out.println(phone.getBrand());
		
	}

}
