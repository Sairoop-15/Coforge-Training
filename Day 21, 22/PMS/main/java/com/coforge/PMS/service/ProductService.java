package com.coforge.PMS.service;

import java.util.List;
import java.util.Optional;

import com.coforge.PMS.dto.SupplierDTO;
import com.coforge.PMS.exception.ProductNotFoundException;
import com.coforge.PMS.model.Product;

public interface ProductService {
	
	public boolean saveProduct(Product product);

	public boolean updateProduct(int productId, Product product);

	public boolean deleteProductById(int productId);

	public Optional<Product> findByPid(int productId);

	public Iterable<Product> findAllProducts();

	public List<Product> findByproductName(String productName);

	public boolean deleteByProductName(String productName);

	List<Product> findByproductQuantity(int productQuantity);

	List<Product> findByPriceRange(double minPrice, double maxPrice);

	List<Integer> getproductIdsList();

	String getInfo();

	public SupplierDTO getSupplierBySupplierId(int supplierId);

	public List<SupplierDTO> findAllSuppliers();


}
