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
    public void getByName(String name) {
        System.out.println(Optional.ofNullable(personRepository.findByName(name)).orElseThrow());
    }

    @Override
    public void getServiceContact(String name) {
        System.out.println(Optional.ofNullable(personRepository.findByName(name)).orElseGet(() ->new Person("12356789",null)));    }

    @Override
    public void logServiceContact(String name) {
        Optional<Person> optional = Optional.ofNullable(personRepository.findByName(name));
        optional.ifPresentOrElse(person -> log.info(name)
                , () -> log.info("No service contact"));
    }

    public Person save(String name,Person person) {
        return personRepository.save(name,new Person(person.getNumber(),person.getName()));
    }

    public String findAll() {
        return personRepository.findAll();
    }
}