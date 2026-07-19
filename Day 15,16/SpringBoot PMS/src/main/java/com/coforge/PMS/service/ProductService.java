package com.coforge.PMS.service;

import java.util.List;
import java.util.Optional;

import com.coforge.PMS.exception.InvalidProductObjectException;
import com.coforge.PMS.exception.ProductNotFoundException;
import com.coforge.PMS.model.Product;

public interface ProductService {
	public boolean saveProduct(Product product) throws InvalidProductObjectException;

	public boolean updateProduct(int productId, Product product)
			throws InvalidProductObjectException, ProductNotFoundException;

	public boolean deleteProductById(int productId)
			throws InvalidProductObjectException, ProductNotFoundException;

	public Optional<Product> findByPid(int productId)
			throws ProductNotFoundException, InvalidProductObjectException;

	public Iterable<Product> findAllProducts();

	public List<Product> findByproductName(String productName)
			throws InvalidProductObjectException, ProductNotFoundException;

	public boolean deleteByProductName(String productName)
			throws InvalidProductObjectException, ProductNotFoundException;

	List<Product> findByproductQuantity(int productQuantity)
			throws InvalidProductObjectException, ProductNotFoundException;

	List<Product> findByPriceRange(double minPrice, double maxPrice)
			throws InvalidProductObjectException, ProductNotFoundException;

	List<Integer> getproductIdsList();

	String getInfo();

}
