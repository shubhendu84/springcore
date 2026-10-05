package com.kk.springDI;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.kk.beans.Vehicle;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){

    
    	  BeanFactory beanFactory=new XmlBeanFactory(new ClassPathResource("com\\kk\\resource\\application-context.xml"));
    	  
    	  Vehicle vehicle= (Vehicle) beanFactory.getBean("peugeot");
    	  System.out.println("result is : "+ vehicle);
    }
}
