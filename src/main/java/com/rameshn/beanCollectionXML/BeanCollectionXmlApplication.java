package com.rameshn.beanCollectionXML;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


@SpringBootApplication
public class BeanCollectionXmlApplication {

	public static void main(String[] args) {
		//SpringApplication.run(BeanCollectionXmlApplication.class, args);

		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		EmpCollection ec=(EmpCollection)context.getBean("empCollection");

		System.out.println("Employee List " + ec.getEmpList());
		System.out.println("Employee Number " + ec.getEmpSet());
		System.out.println("Employee Designation" + ec.getEmpMap());
		System.out.println("Employee Designation string code " +ec.getEmpProp());


	}

}
