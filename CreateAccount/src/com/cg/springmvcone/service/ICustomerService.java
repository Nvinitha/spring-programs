package com.cg.springmvcone.service;

import java.util.List;

import com.cg.springmvcone.dto.CustomerBean;


public interface ICustomerService 
{
	public int addCustomerData(CustomerBean customer);

	 List<CustomerBean> getAllCustomers();
	
}
