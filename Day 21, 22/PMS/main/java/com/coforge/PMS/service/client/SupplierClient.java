package com.coforge.PMS.service.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.coforge.PMS.dto.SupplierDTO;


@FeignClient(name = "SB-SMS", path = "/api/v1/sms")
public interface SupplierClient {

	@GetMapping("/suppliers/{supplierId}")
	SupplierDTO getSupplierBySupplierId(@PathVariable("supplierId") int supplierId);
	
	@GetMapping("/suppliers")
	List<SupplierDTO> getAllSuppliers();


}
