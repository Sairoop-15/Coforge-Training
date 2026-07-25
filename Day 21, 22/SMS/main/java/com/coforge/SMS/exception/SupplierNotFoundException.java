package com.coforge.SMS.exception;

public class SupplierNotFoundException extends RuntimeException {
	public SupplierNotFoundException(String errorMessage) {
		super(errorMessage);
	}

}
