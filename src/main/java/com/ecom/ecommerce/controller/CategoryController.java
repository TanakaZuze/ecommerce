package com.ecom.ecommerce.controller;

import com.ecom.ecommerce.entity.Category;
import com.ecom.ecommerce.entity.Product;
import com.ecom.ecommerce.service.CategoryService;
import com.ecom.ecommerce.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Set;

@RestController
public class CategoryController {
    @Autowired
    private CategoryService categoryService;
    @Autowired
    private ProductService productService;

    @RequestMapping("/categories")
        public List<Category> getAllCategories(){
            return categoryService.getAllCategories();
    }

    @RequestMapping("/products")
    public List<Product> getAllProducts(){
        return productService.getAllProducts();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Category> getProductById(@PathVariable Long id){
        return productService.getProductById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }



    @GetMapping("/{id}")
    public ResponseEntity<Poll> getPollById(@PathVariable Long id){

    }

}
