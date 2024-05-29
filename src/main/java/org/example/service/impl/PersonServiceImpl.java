package org.example.service.impl;

import lombok.extern.java.Log;
import org.example.entity.Person;
import org.example.repository.PersonRepository;
import org.example.service.PersonService;

import java.util.Optional;

@Log
public class PersonServiceImpl implements PersonService {
    PersonRepository personRepository = new PersonRepository();

    @Override
    public Optional<Person> findByName(String name) {
        return Optional.ofNullable(personRepository.findByName(name));
    }

    @Override
    public Person getByName(String name) {
        return findByName(name).orElseThrow();
    }

    @Override
    public Person getServiceContact(String name) {
        return findByName(name).orElseGet(() -> new Person(null, "1234"));
    }

    @Override
    public void logServiceContact(String name) {
        findByName(name).ifPresentOrElse(person -> log.info(name)
                , () -> log.info("No service contact"));
    }

    public Person save(String name, Person person) {
        return personRepository.save(name, person);
    }

    public String findAll() {
        return personRepository.findAll();
    }
}