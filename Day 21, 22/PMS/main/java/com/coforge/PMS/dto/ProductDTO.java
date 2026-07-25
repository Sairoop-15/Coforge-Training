package com.coforge.PMS.dto;

import com.coforge.PMS.model.Product;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

public class ProductDTO {
	private Product product;
	private SupplierDTO supplier;

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public SupplierDTO getSupplier() {
		return supplier;
	}

	public void setSupplier(SupplierDTO supplier) {
		this.supplier = supplier;
	}

	@Override
	public String toString() {
		return "ProductDTO [product=" + product + ", supplier=" + supplier + "]";
	}

	public ProductDTO(Product product, SupplierDTO supplier) {
		super();
		this.product = product;
		this.supplier = supplier;
	}

	public ProductDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

}
