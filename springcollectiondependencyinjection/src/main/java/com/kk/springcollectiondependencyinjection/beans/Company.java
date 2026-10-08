package com.kk.springcollectiondependencyinjection.beans;

import java.util.List;

public class Company {

	private List<String> laptopbrand;
	private List<String> listofprocessormodel;

	public List<String> getLaptopbrand() {
		return laptopbrand;
	}

	public void setLaptopbrand(List<String> laptopbrand) {
		this.laptopbrand = laptopbrand;
	}

	public List<String> getListofprocessormodel() {
		return listofprocessormodel;
	}

	public void setListofprocessormodel(List<String> listofprocessormodel) {
		this.listofprocessormodel = listofprocessormodel;
	}

	@Override
	public String toString() {
		return "Company [laptopbrand=" + laptopbrand + ", listofprocessormodel=" + listofprocessormodel + "]";
	}

}
