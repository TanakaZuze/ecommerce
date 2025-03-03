package com.ecom.ecommerce.controller;

import com.ecom.ecommerce.entity.Category;
import com.ecom.ecommerce.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @RequestMapping("/categories")
        public List<Category> getAllCategories(){
            return categoryService.getAllCategories();
    }
}
