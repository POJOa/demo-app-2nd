package com.example.demo.domain.topic;

import java.time.ZonedDateTime;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(chain = true)
public class TopicDetailDTO  {

    private long id;

    private ZonedDateTime createdAt;

    private ZonedDateTime publishedAt;

    private String title;

    private String thumbnail;

    private String content;

    private String summary;

}
