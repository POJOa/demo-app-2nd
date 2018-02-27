package com.example.demo.domain.topic;

import java.time.ZonedDateTime;
import java.util.List;

import com.example.demo.domain.category.CategoryDTO;
import com.example.demo.domain.tag.TagDTO;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(chain = true)
public class TopicDTO  {
    private long id;

    private String name;

    private ZonedDateTime createdAt;

    private CategoryDTO category;


    private TopicDetailDTO latest;


    private List<TagDTO> tags;


    private List<TopicDetailDTO> versions;



}
