package com.example.demo.domain.category;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepo extends CrudRepository<Category, Long> {
    public Category findByNameIgnoreCase(String name);

}
