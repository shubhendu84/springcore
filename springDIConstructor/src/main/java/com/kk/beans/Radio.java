package com.kk.beans;

public class Radio {

	private IReceiver iReceiver;

	public Radio(IReceiver iReceiver) {
		super();
		this.iReceiver = iReceiver;
	}
	
	public void listen() {
		iReceiver.tuneUp();
		
		System.out.println("Listening.....");
	}
	
	
}
