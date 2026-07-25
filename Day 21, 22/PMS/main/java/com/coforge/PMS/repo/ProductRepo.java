package com.coforge.PMS.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.coforge.PMS.model.Product;

@Repository
public interface ProductRepo extends CrudRepository<Product, Integer>{
	
	public List<Product> findByproductName(String productName);
	public int deleteByproductName(String productName);
	public List<Product> findByproductQuantity(int productQuantity);
	public List<Product> findByproductPriceBetween(double minPrice, double maxPrice);
	
	@Query("select productId from Product")
	public List<Integer> getproductIdsList();

	@Query("select count(*), sum(productPrice) from Product")
	public String getInfo();
}
