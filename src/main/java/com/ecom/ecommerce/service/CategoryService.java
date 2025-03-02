package com.ecom.ecommerce.service;

import com.ecom.ecommerce.entity.Category;
import com.ecom.ecommerce.entity.Product;
import com.ecom.ecommerce.repositries.CategoryRepository;

import com.ecom.ecommerce.repositries.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> getAllCategories(){
        return categoryRepository.findAll();
    }




}
