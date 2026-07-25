package com.coforge.SMS.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coforge.SMS.model.Supplier;
import com.coforge.SMS.service.SupplierService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/v1/sms")
public class SupplierController {

	private Environment environment;
	private SupplierService service;

	@Autowired
	public SupplierController(Environment environment, SupplierService service) {
		super();
		this.environment = environment;
		this.service = service;
	}

	@PostMapping("/suppliers")
	public ResponseEntity<?> addSupplier(@Valid @RequestBody Supplier supplier) {

		Supplier savedSupplier = service.addSupplier(supplier);

		return new ResponseEntity<>(savedSupplier, HttpStatus.CREATED);
	}

	@GetMapping("/suppliers/{supplierId}")
	public ResponseEntity<?> getSupplierById(@PathVariable Long supplierId) {

		Supplier supplier = service.getSupplierById(supplierId);

		return ResponseEntity.ok(supplier);
	}

	@GetMapping("/suppliers")
	public ResponseEntity<?> getAllSuppliers() {

		List<Supplier> suppliers = service.getAllSuppliers();

		return ResponseEntity.ok(suppliers);
	}

	@PutMapping("/suppliers/{supplierId}")
	public ResponseEntity<?> updateSupplier(@PathVariable Long supplierId, @Valid @RequestBody Supplier supplier) {

		Supplier updatedSupplier = service.updateSupplier(supplierId, supplier);

		return ResponseEntity.ok(updatedSupplier);
	}

	@DeleteMapping("/suppliers/{supplierId}")
	public ResponseEntity<?> deleteSupplier(@PathVariable Long supplierId) {

		service.deleteSupplier(supplierId);

		return ResponseEntity.ok("Supplier Deleted Successfully");
	}

}
