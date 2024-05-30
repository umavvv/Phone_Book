package org.example.repository;

import org.example.entity.Person;

import java.util.List;

public interface PersonRepository {
    Person findByName(String name);
    Person save(String name, Person person);
    List<Person> findAll();
}
