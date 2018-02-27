package com.example.demo.domain.category;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(chain = true)
public class CategoryDTO  {


    private long id;

    private String name;



}
