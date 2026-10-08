package com.kk.beanalias;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.kk.beanalias.beans.Customer;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
   //     System.out.println( "Hello World!" );
        
        BeanFactory beanFactory=new XmlBeanFactory(new ClassPathResource("application-context.xml"));
        
        Customer customer = (Customer) beanFactory.getBean("c1");
        System.out.println(customer);
    }
}
