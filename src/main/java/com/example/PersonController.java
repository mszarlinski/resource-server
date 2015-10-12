package com.example;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author mszarlinski on 2015-10-12.
 */
@RequestMapping(value = "/person")
@RestController
public class PersonController {

    private final PersonRepository personRepository;

    @Autowired
    public PersonController(final PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @RequestMapping
    public List<Person> findAll() {
        return personRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Person create(final Person person) {
        return personRepository.saveAndFlush(person);
    }
}
