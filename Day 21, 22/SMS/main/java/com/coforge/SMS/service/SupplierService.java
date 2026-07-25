package com.coforge.SMS.service;

import java.util.List;

import com.coforge.SMS.model.Supplier;

public interface SupplierService {
	
    Supplier addSupplier(Supplier supplier);

    Supplier getSupplierById(Long supplierId);

    List<Supplier> getAllSuppliers();

    Supplier updateSupplier(Long supplierId, Supplier supplier);

    void deleteSupplier(Long supplierId);
}
