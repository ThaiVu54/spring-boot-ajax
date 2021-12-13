package com.example.springbootexception.service.product;

import com.example.springbootexception.model.Product;
import com.example.springbootexception.repository.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductService implements IProductService {
    @Autowired
    private IProductRepository repository;

    @Override
    public Iterable<Product> findAll() {
        return repository.findAll();
    }

    @Override
    public Page<Product> findAll(Pageable pageable) {
        return repository.findAll(pageable);
    }

    @Override
    public Optional<Product> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public Product save(Product product) {
        return repository.save(product);
    }

    @Override
    public void remove(Long id) {
        repository.deleteById(id);
    }

    @Override
    public Page<Product> findByNameContaining(String name, Pageable pageable) {
        return repository.findAllByName(name, pageable);
    }
}
