package com.coforge.PMS.exception;

public class ProductNotFoundException extends Exception {
	
	@Override
	public String toString() {
		return "Product Not Found!";
	}

}
