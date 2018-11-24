package com.cg.springmvcone.dao;

import java.util.List;

import com.cg.springmvcone.dto.CustomerBean;

public interface ICustomerDao {

	int addCustomerData(CustomerBean customerBean);

	List<CustomerBean> getAllCustomers();

	
}
