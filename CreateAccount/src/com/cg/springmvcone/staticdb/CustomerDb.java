package com.cg.springmvcone.staticdb;

import java.util.ArrayList;
import java.util.List;

import com.cg.springmvcone.dto.CustomerBean;

public class CustomerDb {
	private static List<CustomerBean> custList=new ArrayList<CustomerBean>();
	
		static{
			
			custList.add(new CustomerBean(1,"vinitha","Narvaneni","vini@tha.com","F","9703612617","PAN12345JK","chennai",5000));
			custList.add(new CustomerBean(2,"priyanka","Malladi","pri@yanka.com","F","7896541230","PAN12345JK","chennai",5000));
			custList.add(new CustomerBean(1,"prasanna","lakshmi","prasa@nna.com","F","8523697416","PAN12345JK","chennai",5500));
			
		}

		public static List<CustomerBean> getCustList() {
			
			return custList;
		}

}


