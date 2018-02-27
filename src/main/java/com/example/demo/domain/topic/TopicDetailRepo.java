package com.example.demo.domain.topic;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TopicDetailRepo extends CrudRepository<TopicDetail, Long> {

}
