package com.ecom.ecommerce.service;

import com.ecom.ecommerce.entity.Product;
import com.ecom.ecommerce.repositries.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAllProducts(){
        return productRepository.findAll();
    }

    public List<Product> getProductById(Long id){
        return productRepository.findById(id);
    }

}
