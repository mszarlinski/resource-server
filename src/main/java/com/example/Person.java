package com.example;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author mszarlinski on 2015-10-12.
 */
@Entity
public class Person {
    @Id
    private Long id;

    private String name;

    public Long getId() {
        return id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }
}
