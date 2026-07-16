package com.coforge.pms.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.coforge.pms.model.Product;

@Service
public class ProductService {

    private List<Product> list = new ArrayList<>();

    public Boolean createProduct(Product product) {
        boolean status = list.add(product);
        System.out.println(list);
        return status;
    }

    public Boolean updateProduct(Product product) {

        for (int i = 0; i < list.size(); i++) {

            if (list.get(i).getProductId() == product.getProductId()) {

                list.set(i, product);

                System.out.println(list);
                return true;
            }
        }

        return false;
    }
    public Boolean deleteProduct(int pid) {

        for (int i = 0; i < list.size(); i++) {

            if (list.get(i).getProductId() == pid) {

                list.remove(i);

                System.out.println(list);
                return true;
            }
        }

        return false;
    }

    public Product findProduct(int pid) {

        for (Product p : list) {

            if (p.getProductId() == pid) {
                return p;
            }
        }

        return null;
    }

    public List<Product> findAllProduct() {

        return list;
    }
}