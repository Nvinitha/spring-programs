package com.cg.training;

public class ExchangeServiceImpl implements ExchangeService 

{
	double exchangeRate;
	
	public ExchangeServiceImpl(double exchangeRate) {
		System.out.println("ExchangeServiceImpl()");
		this.exchangeRate = exchangeRate;
	}

	public double getExchangeRate() 
	{
		System.out.println("getExchangeRate()");
		return exchangeRate;
	}

}
