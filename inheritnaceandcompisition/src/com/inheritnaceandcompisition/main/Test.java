package com.inheritnaceandcompisition.main;

import com.inheritnaceandcompisition.beans.B;
import com.inheritnaceandcompisition.beans.C;

public class Test {

	public static void main(String[] args) {
		
		B b=new B();
		b.m3();
		
		C c=new C();
		
		c.m4();
		
		int k=c.m1();
		System.out.println(k);
		
	}
}
