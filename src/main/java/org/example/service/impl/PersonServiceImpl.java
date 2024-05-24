package org.example.service.impl;

import lombok.extern.java.Log;
import org.example.entity.Person;
import org.example.repository.impl.PersonRepository;
import org.example.service.PersonService;

import java.util.Optional;

@Log
public class PersonServiceImpl implements PersonService {
    PersonRepository personRepository = new PersonRepository();

    @Override
    public Optional<String> findByName(String name) {
        return Optional.ofNullable(personRepository.findByName(name));
    }

    @Override
    public void getByName(String name) {
        System.out.println(Optional.ofNullable(personRepository.findByName(name)).orElseThrow());
    }

    @Override
    public void getServiceContact(String name) {
        Optional optional = Optional.ofNullable(personRepository.findByName(name));
        System.out.println(Optional.ofNullable(optional.orElseGet(() -> "123456789")).get());
    }

    @Override
    public void logServiceContact(String name) {
        Optional<String> optional = Optional.ofNullable(personRepository.findByName(name));
        optional.ifPresentOrElse(person -> log.info(name)
                , () -> log.info("No service contact"));
    }

    public Person save(Long id, Person persons) {
        personRepository.put(id, new Person(persons.getNumber(), persons.getName()));
        return persons;
    }

    public String findAll() {
        return String.valueOf(personRepository);
    }
}
