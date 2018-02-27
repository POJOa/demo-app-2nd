package com.example.demo.interfaces.rest;

import com.example.demo.domain.category.Category;
import com.example.demo.domain.category.CategoryDTO;
import com.example.demo.service.CategoryService;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "api/category/")
public class CategoryAPI {
    private static ModelMapper m = new ModelMapper();

    @Autowired CategoryService service;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = "application/json")
    public Category get(@PathVariable Long id) {
        return service.get(id);
    }

    @RequestMapping(value = "/", method = RequestMethod.GET, produces = "application/json")
    public Iterable<Category> list() {
        return service.findAll();
    }

    @RequestMapping(value = "/", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
    public CategoryDTO save(@RequestBody CategoryDTO dto) {
        Category c = m.map(dto,Category.class);
        return m.map(service.save(c),CategoryDTO.class);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE, produces = "application/json")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
