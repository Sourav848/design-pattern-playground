package org.design.pattern.creational.builder;

public class PhoneBuilder {
	
	private String os;
	private String ram;
	private String model;
	private String brand;
	private String storageCapacity;
	private double screenSize;
	
	
	public PhoneBuilder setOs(String os) {
		this.os = os;
		return this;
	}
	public PhoneBuilder setRam(String ram) {
		this.ram = ram;
		return this;
	}
	public PhoneBuilder setModel(String model) {
		this.model = model;
		return this;
	}
	public PhoneBuilder setBrand(String brand) {
		this.brand = brand;
		return this;
	}
	public PhoneBuilder setStorageCapacity(String storageCapacity) {
		this.storageCapacity = storageCapacity;
		return this;
	}
	
	public PhoneBuilder setScreenSize(double screenSize) {
		this.screenSize = screenSize;
		return this;
	}
	
	
	public Phone builder() {
		return new Phone(os, ram, model, brand, storageCapacity, screenSize);
	}

}
