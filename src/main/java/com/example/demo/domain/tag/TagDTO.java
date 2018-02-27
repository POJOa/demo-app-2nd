package com.example.demo.domain.tag;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(chain = true)
public class TagDTO  {


    private long id;


    private String name;



}
