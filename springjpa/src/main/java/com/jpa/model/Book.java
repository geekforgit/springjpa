package com.jpa.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter

public class Book {
    long id;
    String name;
    String desc;

    public Book(long id, String name, String desc) {
        this.id = id;
        this.name = name;
        this.desc = desc;
    }
}
