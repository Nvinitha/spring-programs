package com.cg.springmvcone.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cg.springmvcone.dao.ICustomerDao;
import com.cg.springmvcone.dto.CustomerBean;

@Service("customerservice")
@Transactional
public class CustomerServiceImpl implements ICustomerService {

	@Autowired
	ICustomerDao customerdao;
	@Override
	public int addCustomerData(CustomerBean customerBean) 
	{
		// TODO Auto-generated method stub
		return customerdao.addCustomerData(customerBean);
	}
	@Override
	public List<CustomerBean> getAllCustomers() {
		// TODO Auto-generated method stub
		return customerdao.getAllCustomers();
	}

	
}
