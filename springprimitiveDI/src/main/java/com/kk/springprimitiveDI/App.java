package com.kk.springprimitiveDI;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

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
    	// without spring
    /*	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    	
    	
    	Customer customer=new Customer();
    	customer.setName("Laxman");
    	customer.setDob(sdf.parse("01/01/2002"));
    	customer.setPhone(1831564021);
    	customer.setKyc("Laxman");
    	
    	OpenSavingAccount openSavingAccount=new OpenSavingAccount();
    	openSavingAccount.openAccount(customer);
    */
    	// with spring
    	
    	BeanFactory beanFactory=new XmlBeanFactory(new ClassPathResource("application-context.xml"));
    	Customer customer = (Customer) beanFactory.getBean("customer");
    	
    	OpenSavingAccount account = (OpenSavingAccount) beanFactory.getBean("openaccount");
    	
    	account.openAccount(customer);
    	
    	
    }
}
