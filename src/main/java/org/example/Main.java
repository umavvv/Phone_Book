package org.example;

import org.example.repository.PersonRepository;
import org.example.service.Impl.PersonServiceImpl;

public class Main {
    public static void main(String[] args) {
        String consoleName = "service";
      PersonRepository personRepository = new PersonRepository();
      personRepository.findByName(consoleName);

    }
}