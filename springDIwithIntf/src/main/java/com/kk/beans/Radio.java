package com.kk.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class Radio {


//	private Receiver10Hz hz;

	  private IReceiver hz;
	
	  public void setHz(Receiver10Hz hz) { this.hz = hz; }
	 
	
	public void listen() {
		
		hz.tuneUp();
		System.out.println("Radio Band Listening......");
	}
}
