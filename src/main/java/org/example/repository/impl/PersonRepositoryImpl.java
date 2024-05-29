package org.example.repository;

import org.example.entity.Person;

import java.util.*;

public class PersonRepository {
    private HashMap<String, Person> map = new HashMap<>();

    public Person findByName(String name) {
        return map.get(name);
    }

    public Person save(String name, Person person) {
        map.put(name, person);
        return person;
    }

    public List<Person> findAll() {
        return (List<Person>) map.values();
    }
}
