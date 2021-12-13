package com.example.springbootexception.service.category;

import com.example.springbootexception.model.Category;
import com.example.springbootexception.repository.ICategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public class CategoryService implements ICategoryService{
    @Autowired private ICategoryRepository repository;
    @Override
    public Iterable<Category> findAll() {
        return repository.findAll();
    }

    @Override
    public Page<Category> findAll(Pageable pageable) {
        return repository.findAll(pageable);
    }

    @Override
    public Optional<Category> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public Category save(Category category) {
        return repository.save(category);
    }

    @Override
    public void remove(Long id) {
        repository.deleteById(id);
    }
}
