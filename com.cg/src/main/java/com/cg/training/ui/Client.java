package com.cg.training.ui;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.training.CurrencyConverter;

public class Client 
{
	public static void main(String[] args) 
	{
		ApplicationContext factory = new ClassPathXmlApplicationContext("currencyConverter.xml");
		CurrencyConverter curr = (CurrencyConverter) factory.getBean("currencyConverter");
		double rupees = curr.dollarsToRupees(50.0);
		System.out.println("50 $ is "+rupees+" Rs. ");
		
		
		
	}

}
