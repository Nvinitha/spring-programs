package com.cg.springmvcone.dto;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

	@Entity
	@Table(name="Bank_Customer2")
	public class CustomerBean {
		
		@Id
		@Column(name="cust_id")
		@GeneratedValue(strategy=GenerationType.AUTO)
		private int Id;

		@Column(name="First_name")
		private String firstName;
		
		public CustomerBean(int id, String firstName, String lastName,
				String emailId, String gender, String phoneNo, String panNum,
				String address, double balance) {
			super();
			Id = id;
			this.firstName = firstName;
			this.lastName = lastName;
			this.emailId = emailId;
			this.gender = gender;
			this.phoneNo = phoneNo;
			this.panNum = panNum;
			this.address = address;
			this.balance = balance;
		}


		@Column(name="Last_name")
		private String lastName;
		
		@Column(name="email_id")
		private String emailId;
		@Column(name="gender")
		private String gender;
		
		
		@Column(name="phone_number")
		private String phoneNo;
		
		@Column(name="pan_number")
		private String panNum;
		
		@Column(name="address")
		private String address;
		
		@OneToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
		@JoinColumn(name="bank_id")
		private double balance;
		
		

		
		
		public int getId() {
			return Id;
		}
		public void setId(int id) {
			Id = id;
		}
		
		public double getBalance() {
			return balance;
		}
		public void setBalance(double balance) {
			this.balance = balance;
		}
		@Override
		public String toString() {
			return "CustomerBean [Id=" + Id + ", firstName=" + firstName
					+ ", lastName=" + lastName + ", emailId=" + emailId
					+ ", gender=" + gender + ", phoneNo=" + phoneNo
					+ ", panNum=" + panNum + ", address=" + address
					+ ", balance=" + balance + "]";
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		public String getPhoneNo() {
			return phoneNo;
		}
		public void setPhoneNo(String phoneNo) {
			this.phoneNo = phoneNo;
		}
		
		public String getFirstName() {
			return firstName;
		}
		
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		public String getEmailId() {
			return emailId;
		}
		public void setEmailId(String emailId) {
			this.emailId = emailId;
		}
		
		public String getPanNum() {
			return panNum;
		}
		public void setPanNum(String panNum) {
			this.panNum = panNum;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		
		
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + Id;
			return result;
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			CustomerBean other = (CustomerBean) obj;
			if (Id != other.Id)
				return false;
			return true;
		}
		
		
		public CustomerBean() {
			super();
		}
		
		
		
		
		
		
			

}



