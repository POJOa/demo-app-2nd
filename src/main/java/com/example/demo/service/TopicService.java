package com.example.demo.service;

import com.example.demo.domain.topic.Topic;
import com.example.demo.domain.topic.TopicRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {
    @Autowired TopicRepo repo;

    public Topic get(Long id){
        return repo.findById(id).orElse(null);
    }

    public Iterable<Topic> findAll(){
        return repo.findAll();
    }

    public Topic save(Topic t){return repo.save(t);}

    public void delete(Long id){repo.deleteById(id);}
}
