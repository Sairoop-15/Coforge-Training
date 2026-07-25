package com.coforge.SMS.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coforge.SMS.exception.SupplierNotFoundException;
import com.coforge.SMS.model.Supplier;
import com.coforge.SMS.repo.SupplierRepo;

@Service
public class SupplierServiceImpl implements SupplierService {

	@Autowired
	private SupplierRepo repository;

	@Override
	public Supplier addSupplier(Supplier supplier) {
		return repository.save(supplier);
	}

	@Override
	public Supplier getSupplierById(Long supplierId) {

		Supplier supplier = repository.getBysupplierId(supplierId);

		if (supplier == null)
			throw new SupplierNotFoundException("Supplier with ID " + supplierId + " not found");

		return supplier;
	}

	@Override
	public List<Supplier> getAllSuppliers() {

		return (List<Supplier>) repository.findAll();
	}

	@Override
	public Supplier updateSupplier(Long supplierId, Supplier supplier) {

		if (repository.getBysupplierId(supplierId) == null)
			throw new SupplierNotFoundException("Supplier with ID " + supplierId + " not found");
		else {
			repository.deleteBysupplierId(supplierId);
			return repository.save(supplier);
		}
	}

	@Override
	public void deleteSupplier(Long supplierId) {

		if (repository.getBysupplierId(supplierId) == null)
			throw new SupplierNotFoundException("Supplier with ID " + supplierId + " not found");

		repository.deleteBysupplierId(supplierId);
	}

}