package com.kk.springcollectiondependencyinjection;

import java.util.List;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.kk.springcollectiondependencyinjection.beans.Company;
import com.kk.springcollectiondependencyinjection.beans.Course;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

		/*
		 * BeanFactory beanFactory=new XmlBeanFactory(new
		 * ClassPathResource("application-context.xml"));
		 * 
		 * Course course=(Course) beanFactory.getBean("cse1sem");
		 * System.out.println(course);
		 */
    	//
    	BeanFactory beanFactory=new XmlBeanFactory(new ClassPathResource("application-context.xml"));
    	
    	Company company=(Company) beanFactory.getBean("company");
    	System.out.println(company);
    	
    	List<String> brnd=company.getLaptopbrand();
    	
    	for(String b: brnd) {
    		System.out.println(b);
    	}
    	
    }
}
