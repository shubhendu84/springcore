package com.kk.springprimitiveDI;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import com.kk.springprimitiveDI.beans.Customer;
import com.kk.springprimitiveDI.beans.OpenSavingAccount;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws ParseException
    {
      //  System.out.println( "Hello World!" );
    	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    	
    	
    	Customer customer=new Customer();
    	customer.setName("Laxman");
    	customer.setDob(sdf.parse("01/01/2002"));
    	customer.setPhone(1831564021);
    	customer.setKyc("Laxman");
    	
    	OpenSavingAccount openSavingAccount=new OpenSavingAccount();
    	openSavingAccount.openAccount(customer);
    }
}
