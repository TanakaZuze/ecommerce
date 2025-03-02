package com.ecom.ecommerce.entity;

import com.ecom.ecommerce.entity.Product;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Entity
@Data
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @OneToMany(mappedBy = "category",
    cascade = CascadeType.ALL,
    fetch = FetchType.LAZY
    )
    private Set<Product> products;
}
