package org.design.pattern.creational.builder;

public class Phone {
	
	private String os;
	private String ram;
	private String model;
	private String brand;
	private String storageCapacity;
	private double screenSize;

	
	public Phone(String os, String ram, String model, String brand, String storageCapacity, double screenSize) {
		super();
		this.os = os;
		this.ram = ram;
		this.model = model;
		this.brand = brand;
		this.storageCapacity = storageCapacity;
		this.screenSize = screenSize;
	}
	
	@Override
	public String toString() {
		return "Phone [os=" + os + ", ram=" + ram + ", model=" + model + ", brand=" + brand + ", storageCapacity="
				+ storageCapacity + ", screenSize=" + screenSize + "]";
	}




	public String getOs() {
		return os;
	}


	public void setOs(String os) {
		this.os = os;
	}


	public String getRam() {
		return ram;
	}


	public void setRam(String ram) {
		this.ram = ram;
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	public String getStorageCapacity() {
		return storageCapacity;
	}


	public void setStorageCapacity(String storageCapacity) {
		this.storageCapacity = storageCapacity;
	}


	public double getScreenSize() {
		return screenSize;
	}


	public void setScreenSize(double screenSize) {
		this.screenSize = screenSize;
	}
	
}
