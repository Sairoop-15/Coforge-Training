package com.coforge.SMS.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "Supplier")
public class Supplier {

    @Id
    @NotNull(message = "Supplier ID cannot be null")
    @Positive(message = "Supplier ID must be positive")
    private Long supplierId;

    @NotBlank(message = "Supplier Name cannot be blank")
    @Size(min = 3, max = 50, message = "Supplier Name must be between 3 and 50 characters")
    @Pattern(regexp = "^[A-Za-z ]+$", message = "Supplier Name must contain only alphabets and spaces")
    private String supplierName;

    @NotBlank(message = "City cannot be blank")
    @Size(min = 3, max = 30, message = "City must be between 3 and 30 characters")
    @Pattern(regexp = "^[A-Za-z ]+$", message = "City must contain only alphabets and spaces")
    private String city;

    public Supplier() {
    }

    public Supplier(Long supplierId, String supplierName, String city) {
        this.supplierId = supplierId;
        this.supplierName = supplierName;
        this.city = city;
    }

    public Long getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Long supplierId) {
        this.supplierId = supplierId;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Supplier [supplierId=" + supplierId +
                ", supplierName=" + supplierName +
                ", city=" + city + "]";
    }
}