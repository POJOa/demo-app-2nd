package com.example.demo.service;

import com.example.demo.domain.tag.Tag;
import com.example.demo.domain.tag.TagRepo;

import org.springframework.beans.factory.annotation.Autowired;

public class TagService {
    @Autowired TagRepo repo;

    public Tag get(Long id){
        return repo.findById(id).orElse(null);
    }

    public Iterable<Tag> findAll(){
        return repo.findAll();
    }

    public Tag save(Tag t){return repo.save(t);}

    public void delete(Long id){repo.deleteById(id);}

}
