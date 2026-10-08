package com.kk.beanalias;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.kk.beanalias.beans.Vehicle;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("application-context.xml"));

		Vehicle veh = (Vehicle) beanFactory.getBean("car suzuki");

		System.out.println(veh);
	}
}
