package com.coforge.PMS.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.coforge.PMS.exception.InvalidProductObjectException;
import com.coforge.PMS.exception.ProductNotFoundException;
import com.coforge.PMS.model.Product;
import com.coforge.PMS.repo.ProductRepo;

@Service
public class ProductServiceImpl implements ProductService {

	private ProductRepo productRepo;
	Environment environment;

	@Autowired
	public ProductServiceImpl(ProductRepo productRepo, Environment environment) {
		super();
		this.productRepo = productRepo;
		this.environment = environment;
	}

	@Override
	public boolean saveProduct(Product product) {

		productRepo.save(product);
		return true;
	}

	@Override
	public boolean updateProduct(int productId, Product product) {

		if (!productRepo.existsById(productId))
			throw new ProductNotFoundException(environment.getProperty("pms.invalid.product-notfound"));
		productRepo.save(product);
		return true;
	}

	@Override
	public boolean deleteProductById(int productId) {

		if (!productRepo.existsById(productId))
			throw new ProductNotFoundException(environment.getProperty("pms.invalid.product-notfound"));
		productRepo.deleteById(productId);
		return true;
	}

	@Override
	public Optional<Product> findByPid(int productId) {

		if (productRepo.existsById(productId))
			return productRepo.findById(productId);
		else
			throw new ProductNotFoundException(environment.getProperty("pms.invalid.product-notfound"));
	}

	@Override
	public Iterable<Product> findAllProducts() {
		return productRepo.findAll();
	}

	@Override
	public List<Product> findByproductName(String productName) {

		List<Product> products = productRepo.findByproductName(productName);
		if (products.isEmpty())
			throw new ProductNotFoundException(environment.getProperty("pms.invalid.product-notfound"));
		return products;
	}

	@Override
	@Transactional
	public boolean deleteByProductName(String productName) {

		int n = productRepo.deleteByproductName(productName);
		if (n == 0) {
			throw new ProductNotFoundException(environment.getProperty("pms.invalid.product-notfound"));
		}
		return true;
	}

	@Override
	public List<Product> findByproductQuantity(int productQuantity) {

		List<Product> products = productRepo.findByproductQuantity(productQuantity);
		if (products.isEmpty()) {
			throw new ProductNotFoundException(environment.getProperty("pms.invalid.product-notfound"));
		}
		return products;
	}

	@Override
	public List<Product> findByPriceRange(double minPrice, double maxPrice) {

		List<Product> products = productRepo.findByproductPriceBetween(minPrice, maxPrice);
		if (products.isEmpty()) {
			throw new ProductNotFoundException(environment.getProperty("pms.invalid.product-notfound"));
		}
		return products;
	}

	@Override
	public List<Integer> getproductIdsList() {
		return productRepo.getproductIdsList();
	}

	@Override
	public String getInfo() {
		return productRepo.getInfo();
	}
}
