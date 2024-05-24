package org.example.service;

import org.example.entity.Person;

import java.util.Optional;

public interface PersonService {
    Optional<String> findByName(String name);
    void getByName(String name);
    void getServiceContact(String name);
    void logServiceContact(String name);
    Person save(Long id,Person persons);
    String findAll();
}
