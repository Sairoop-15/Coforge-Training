package com.coforge.config;

import java.util.Arrays;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.coforge.model.Customer;
import com.coforge.model.DeliveryAddress;

@Configuration
public class BeansConfiguration {

	@Bean(name = "Customer1")
	public Customer getCustomer() {
		Customer customer = new Customer();
		customer.setCustomerId(101);
		customer.setCustomerName("Sairoop");
		customer.setEmail(Arrays.asList("sairoop@gmail.com", "sairoop1@gmail.com"));
		customer.setDeliveryAddress(Arrays.asList(getDeliveryAddress(), getDeliveryAddress2()));
		return customer;
	}

	@Bean(name = "deliveryAddress1")
	public DeliveryAddress getDeliveryAddress() {
		DeliveryAddress deliveryAddress1 = new DeliveryAddress();
		deliveryAddress1.setCity("city1");
		deliveryAddress1.setState("state1");
		return deliveryAddress1;
	}

	@Bean(name = "deliveryAddress2")
	public DeliveryAddress getDeliveryAddress2() {
		DeliveryAddress deliveryAddress1 = new DeliveryAddress();
		deliveryAddress1.setCity("city2");
		deliveryAddress1.setState("state2");
		return deliveryAddress1;
	}

}
