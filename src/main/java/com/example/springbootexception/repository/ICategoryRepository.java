package com.example.springbootexception.repository;

import com.example.springbootexception.model.Category;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ICategoryRepository extends PagingAndSortingRepository<Category, Long> {
}
