package com.example.demo.service;

import com.example.demo.domain.category.Category;
import com.example.demo.domain.category.CategoryRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {
    @Autowired CategoryRepo repo;

    public Category get(Long id){
        return repo.findById(id).orElse(null);
    }

    public Iterable<Category> findAll(){
        return repo.findAll();
    }

    public Category save(Category c){return repo.save(c);}

    public void delete(Long id){repo.deleteById(id);}
}
