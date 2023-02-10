package com.ap;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class Test {
	
	public static void main(String[] args) {
		
		
		 // ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
		 // Car c = context.getBean(Car.class);
		
		BeanFactory beanFactory=new XmlBeanFactory(new ClassPathResource("bean.xml"));
		System.out.println("beanfactory started ........");
		beanFactory.getBean(PetrolEngine.class);
		
		
	}

}
