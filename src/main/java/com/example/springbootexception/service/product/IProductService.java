package com.example.springbootexception.service.product;

import com.example.springbootexception.model.Product;
import com.example.springbootexception.service.IGenericService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IProductService extends IGenericService<Product> {
    Page<Product> findByNameContaining(String name, Pageable pageable);
}
