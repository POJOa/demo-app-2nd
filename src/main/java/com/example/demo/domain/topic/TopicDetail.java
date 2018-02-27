package com.example.demo.domain.topic;

import java.time.ZonedDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@EqualsAndHashCode
@Accessors(chain = true)
@Entity
@Table(name="topic_detail")
@NamedQuery(name="TopicDetail.findAll", query="SELECT td FROM TopicDetail td")
public class TopicDetail  {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;

    @Column(name="created_at")
    private ZonedDateTime createdAt;

    @Column(name="published_at")
    private ZonedDateTime publishedAt;

    @Column(name="title")
    private String title;

    @Column(name="thumbnail")
    private String thumbnail;

    @Column(name="content")
    private String content;

    @Column(name="summary")
    private String summary;

}
