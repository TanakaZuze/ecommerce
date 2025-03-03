package com.ecom.ecommerce.config;

import com.ecom.ecommerce.entity.Category;
import com.ecom.ecommerce.entity.Product;
import com.ecom.ecommerce.repositries.CategoryRepository;
import com.ecom.ecommerce.repositries.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class DataSeeder implements CommandLineRunner {
    @Autowired
    private  ProductRepository productRepository;
    @Autowired
    private CategoryRepository categoryRepository;
    @Override
    public void run(String... args) throws Exception {
//clear all data
        productRepository.deleteAll();
        categoryRepository.deleteAll();

//        creating the categories
        Category electronics=new Category();
        electronics.setName("Electronics");


        Category appliance=new Category();
        appliance.setName("Appliances");

        Category clothing=new Category();
        clothing.setName("Clothing");

        Category furniture=new Category();
        furniture.setName("Furniture");

        categoryRepository.saveAll(Arrays.asList(electronics,appliance,clothing,furniture));


//        create products,1 for each
//        electronics
        Product zFlip=new Product();
        zFlip.setName("Z-Flip");
        zFlip.setDescription("Fordable new generation Z flip phone");
        zFlip.setImageUrl("https://placehold.co/300x252");
        zFlip.setPrice(200_000.00);
        zFlip.setCategory(electronics);
//        Appliance
        Product kettle=new Product();
        kettle.setName("Kettle");
        kettle.setDescription("Kettle new generation Kettle phone");
        kettle.setImageUrl("https://placehold.co/300x252");
        kettle.setPrice(200.00);
        kettle.setCategory(appliance);
//        Clothing
        Product jeans=new Product();
        jeans.setName("Jeans");
        jeans.setDescription("Jeans new generation Jeans");
        jeans.setImageUrl("https://placehold.co/300x252");
        jeans.setPrice(200.00);
        jeans.setCategory(clothing);
//        furniture
        Product dinningSet=new Product();
        dinningSet.setName("Dinning Set");
        dinningSet.setDescription("Dinning Set new generation Dinning Set");
        dinningSet.setImageUrl("https://placehold.co/300x252");
        dinningSet.setPrice(200.00);
        dinningSet.setCategory(furniture);

        productRepository.saveAll(Arrays.asList(zFlip,kettle,jeans,dinningSet));


    }
}
