package com.kk.beanalias.beans;

public class Vehicle {

	private int chesisNumber;
	private String brand;

	public int getChesisNumber() {
		return chesisNumber;
	}

	public void setChesisNumber(int chesisNumber) {
		this.chesisNumber = chesisNumber;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "Vehicle [chesisNumber=" + chesisNumber + ", brand=" + brand + "]";
	}

}
