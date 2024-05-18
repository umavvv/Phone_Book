package org.example.service.Impl;

import org.example.repository.PersonRepository;
import org.example.service.PersonService;

import java.util.Optional;
import java.util.logging.Logger;


public class PersonServiceImpl implements PersonService {
    private Logger logger = Logger.getLogger(PersonServiceImpl.class.getName());

    PersonRepository personRepository = new PersonRepository();

    @Override
    public Optional<String> findByName(String name) {
            return Optional.ofNullable("personRepository.findByName(name)");
    }

    @Override
    public String getByName(String name) {
        return Optional.ofNullable("personRepository.findByName(name)").orElseThrow();
    }

    @Override
    public void getServiceContact(String name) {
        System.out.println(Optional.ofNullable(findByName(name)
                .orElseGet(() -> "123456789")).get());
    }

    @Override
    public void logServiceContact(String name) {
        Optional<String> optional = Optional.ofNullable(name);
        optional.ifPresentOrElse(person -> logger.info(name)
                , () -> logger.info("No service contact"));
    }
}
