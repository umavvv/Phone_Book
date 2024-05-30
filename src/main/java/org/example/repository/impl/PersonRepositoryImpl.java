package org.example.repository.impl;

import org.example.entity.Person;
import org.example.repository.PersonRepository;

import java.util.HashMap;
import java.util.List;

public class PersonRepositoryImpl implements PersonRepository {
    private final HashMap<String, Person> map = new HashMap<>();

    @Override
    public Person findByName(String name) {
        return map.get(name);
    }

    @Override
    public Person save(String name, Person person) {
        map.put(name, person);
        return person;
    }

    @Override
    public List<Person> findAll() {
        return (List<Person>) map.values();
    }
}
