package com.coforge.PMS.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.coforge.PMS.exception.InvalidProductObjectException;
import com.coforge.PMS.exception.ProductNotFoundException;
import com.coforge.PMS.model.Product;
import com.coforge.PMS.repo.ProductRepo;

@Service
public class ProductServiceImpl implements ProductService {

	private ProductRepo productRepo;

	@Autowired
	public ProductServiceImpl(ProductRepo productRepo) {
		super();
		this.productRepo = productRepo;
	}

	@Override
	public boolean saveProduct(Product product) throws InvalidProductObjectException {
		if (product.getProductId() > 0 && product.getProductName() != null && product.getProductPrice() > 0
				&& product.getProductQuantity() > 0) {
			productRepo.save(product);
			return true;
		}
		throw new InvalidProductObjectException();
	}

	@Override
	public boolean updateProduct(int productId, Product product)
			throws InvalidProductObjectException, ProductNotFoundException {
		if (product.getProductId() > 0 && product.getProductName() != null && product.getProductPrice() > 0
				&& product.getProductQuantity() > 0) {
			if (!productRepo.existsById(productId))
				throw new ProductNotFoundException();
			productRepo.save(product);
		}
		throw new InvalidProductObjectException();
	}

	@Override
	public boolean deleteProductById(int productId) throws InvalidProductObjectException, ProductNotFoundException {
		if (productId > 0) {
			if (!productRepo.existsById(productId))
				throw new ProductNotFoundException();
			productRepo.deleteById(productId);
			return true;
		}
		throw new InvalidProductObjectException();
	}

	@Override
	public Optional<Product> findByPid(int productId) throws ProductNotFoundException, InvalidProductObjectException {
		if (productId < 0) {
			if (productRepo.existsById(productId))
				productRepo.findById(productId);
			else
				throw new ProductNotFoundException();
		}
		throw new InvalidProductObjectException();
	}

	@Override
	public Iterable<Product> findAllProducts() {
		return productRepo.findAll();
	}

	@Override
	public List<Product> findByproductName(String productName)
			throws InvalidProductObjectException, ProductNotFoundException {
		if (productName != null) {
			List<Product> products = productRepo.findByproductName(productName);
			if (products.isEmpty())
				throw new ProductNotFoundException();
		}
		throw new InvalidProductObjectException();
	}

	@Override
	@Transactional
	public boolean deleteByProductName(String productName)
			throws InvalidProductObjectException, ProductNotFoundException {
		if (productName != null) {
			int n = productRepo.deleteByproductName(productName);
			if (n == 0) {
				throw new ProductNotFoundException();
			}
			return true;
		}
		throw new InvalidProductObjectException();
	}
	
	@Override
	public List<Product> findByproductQuantity(int productQuantity)
			throws InvalidProductObjectException, ProductNotFoundException {

		if (productQuantity > 0) {
			List<Product> products = productRepo.findByproductQuantity(productQuantity);
			if (products.isEmpty()) {
				throw new ProductNotFoundException();
			}
			return products;
		}
		throw new InvalidProductObjectException();
	}

	@Override
	public List<Product> findByPriceRange(double minPrice, double maxPrice)
			throws InvalidProductObjectException, ProductNotFoundException {
		if (minPrice > 0 && maxPrice > 0) {
			List<Product> products = productRepo.findByproductPriceBetween(minPrice, maxPrice);
			if (products.isEmpty()) {
				throw new ProductNotFoundException();
			}
			return products;
		}
		throw new InvalidProductObjectException();
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

