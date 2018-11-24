package com.cg;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Client 
{
	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("customBean.xml");
		User details =  (User) factory.getBean("customBean");
		String username = details.getUsername();
		String password = details.getPassword();
		System.out.println(username);
		System.out.println(password);
		
		
	}
			
			
			

}
