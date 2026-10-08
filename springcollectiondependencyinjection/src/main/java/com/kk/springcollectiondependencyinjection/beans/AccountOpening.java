package com.kk.springcollectiondependencyinjection.beans;

import java.util.Iterator;
import java.util.List;

public class AccountOpening {

	private List<Customer> allinfo;
	
	
	
	
	public AccountOpening(List<Customer> allinfo) {
		super();
		this.allinfo = allinfo;
	}




	public void customerDetail() {
		
		Iterator<Customer> it1=allinfo.iterator();
		
		while(it1.hasNext()) {
			System.out.println(it1.next());
		}
		System.out.println(allinfo);
	}
}
