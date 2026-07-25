package com.coforge.SMS.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.coforge.SMS.model.Supplier;

@Repository
public interface SupplierRepo extends CrudRepository<Supplier, Long>{
	public boolean deleteBysupplierId(Long supplierId);
	public Supplier getBysupplierId(Long supplierId);
}
