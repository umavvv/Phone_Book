package org.example.service;

import org.example.entity.Person;

import java.util.Optional;

public interface PersonService {
    Optional<Person> findByName(String name);
    Person getByName(String name);
    Person getServiceContact(String name);
    void logServiceContact(String name);
    Person save(String name, Person person);
    String findAll();
}
