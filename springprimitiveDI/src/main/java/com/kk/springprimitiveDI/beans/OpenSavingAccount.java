package com.kk.springprimitiveDI.beans;

public class OpenSavingAccount extends AbstractBank{

	@Override
	public void openAccount(Customer c) {
		// TODO Auto-generated method stub
		
		boolean kyc = validateKYC(c); // from abstract class
        if(kyc) {
        	String accNo = generateAccountNo(); // from abstract class
            System.out.println("Saving Account Opened: " + accNo);
            System.out.println("Congratulations! Your account has been successfully opened. Welcome!");
	
        }else {
        	System.out.println("Can't open saving account due to kyc failed....!!");
        }
        
	}

}
