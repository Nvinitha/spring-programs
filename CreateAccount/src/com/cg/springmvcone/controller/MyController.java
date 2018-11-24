package com.cg.springmvcone.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cg.springmvcone.dto.CustomerBean;
import com.cg.springmvcone.service.ICustomerService;

@RestController
@CrossOrigin(origins = "http://localhost:8080")
public class MyController 
{
	
	@Autowired
	ICustomerService custservice;

	//display create account page
	
	@RequestMapping("home")
	public String addAccount() 
	{
		return "addcustomer";
	}
	
	@RequestMapping(value ="/createAccount",consumes = MediaType.APPLICATION_JSON_VALUE,headers="Accept=application/json",method = RequestMethod.POST)
	public List<CustomerBean> createAccount(@RequestBody CustomerBean customer) 
	{

		
		custservice.addCustomerData(customer);
		return custservice.getAllCustomers();
	}

	}

	