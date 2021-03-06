package com.example.demo.interfaces.rest;

import com.example.demo.domain.topic.Topic;
import com.example.demo.domain.topic.TopicDTO;
import com.example.demo.service.TopicService;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "api/topic/")
public class TopicAPI {
    private static ModelMapper m = new ModelMapper();

    @Autowired TopicService service;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = "application/json")
    public Topic get(@PathVariable Long id) {
        return service.get(id);
    }

    @RequestMapping(value = "/", method = RequestMethod.GET, produces = "application/json")
    public Iterable<Topic> list() {
        return service.findAll();
    }

    @RequestMapping(value = "/", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
    public TopicDTO save(@RequestBody TopicDTO dto) {
        Topic t = m.map(dto,Topic.class);
        return m.map(service.save(t),TopicDTO.class);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE, produces = "application/json")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }

}
