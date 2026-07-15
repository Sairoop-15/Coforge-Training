package com.coforge.model;

import java.util.List;

public class Customer {
	private int customerId;
	private String customerName;
	private List<String> email;
	private List<DeliveryAddress> deliveryAddress;

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public List<String> getEmail() {
		return email;
	}

	public void setEmail(List<String> email) {
		this.email = email;
	}

	public List<DeliveryAddress> getDeliveryAddress() {
		return deliveryAddress;
	}

	public void setDeliveryAddress(List<DeliveryAddress> deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", email=" + email
				+ ", deliveryAddress=" + deliveryAddress + "]";
	}

	public Customer(int customerId, String customerName, List<String> email, List<DeliveryAddress> deliveryAddress) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.email = email;
		this.deliveryAddress = deliveryAddress;
	}

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

}
