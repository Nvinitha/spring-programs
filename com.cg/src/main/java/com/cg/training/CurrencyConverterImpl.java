package com.cg.training;

public class CurrencyConverterImpl implements CurrencyConverter 
{

	private ExchangeService exchangeService; //incase it is primitive we write value instead of ref in xml

	//default constructor
	public CurrencyConverterImpl() 
	{
		System.out.println("CurrencyConverterImpl()");
	}

	//getters and setters
	
	public ExchangeService getExchangeService() 
	{

		System.out.println("getExchangeService()");
		return exchangeService;
	}

	public void setExchangeService(ExchangeService exchangeService) 
	{
		System.out.println("setExchangeService()");
		this.exchangeService = exchangeService;
	}

	public double dollarsToRupees(double dollars) 
	{
		System.out.println("dollarsToRupees()");
		return dollars * exchangeService.getExchangeRate();
	}

}
