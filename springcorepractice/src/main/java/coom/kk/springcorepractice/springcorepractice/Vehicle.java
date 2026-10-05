package coom.kk.springcorepractice.springcorepractice;

public class Vehicle {

	 	private String brand;
	    private String model;
	    private String country;
	    private String fuelType;
	    private int year;
	    
	    public String getBrand() {
	        return brand;
	    }

	    public void setBrand(String brand) {
	    	System.out.println("Brand set : "+brand);
	        this.brand = brand;
	    }

	    public String getModel() {
	        return model;
	    }

	    public void setModel(String model) {
	        this.model = model;
	    }

	    public String getCountry() {
	        return country;
	    }

	    public void setCountry(String country) {
	        this.country = country;
	    }

	    public String getFuelType() {
	        return fuelType;
	    }

	    public void setFuelType(String fuelType) {
	        this.fuelType = fuelType;
	    }

	    public int getYear() {
	        return year;
	    }

	    public void setYear(int year) {
	        this.year = year;
	    }

	    public void display() {
	        System.out.println("Brand     : " + brand);
	        System.out.println("Model     : " + model);
	        System.out.println("Country   : " + country);
	        System.out.println("Fuel Type : " + fuelType);
	        System.out.println("Year      : " + year);
	    }
	
}
