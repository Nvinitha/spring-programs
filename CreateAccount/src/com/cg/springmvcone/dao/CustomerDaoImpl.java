package com.cg.springmvcone.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.cg.springmvcone.dto.CustomerBean;
import com.cg.springmvcone.staticdb.CustomerDb;

@Repository("customerdao")
public class CustomerDaoImpl implements ICustomerDao {

	@PersistenceContext
	EntityManager entityManager;
	
	@Override
	public int addCustomerData(CustomerBean customerBean) 
	{
		entityManager.persist(customerBean);
		entityManager.flush();
		return customerBean.getId();
	}

	@Override
	public List<CustomerBean> getAllCustomers() {
		// TODO Auto-generated method stub
		return CustomerDb.getCustList();
	}

	

}
