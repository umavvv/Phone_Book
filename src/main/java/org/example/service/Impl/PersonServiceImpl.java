package org.example.service.Impl;

import lombok.extern.java.Log;
import org.example.repository.PersonRepository;
import org.example.service.PersonService;

import java.util.Optional;

@Log
public class PersonServiceImpl implements PersonService {
    PersonRepository personRepository = new PersonRepository();

    @Override
    public void findByName(String name) {
        System.out.println(Optional.ofNullable(personRepository.findByName(name)));
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
}
