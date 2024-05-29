package org.example.repository;

import lombok.EqualsAndHashCode;
import org.example.entity.Person;

import java.util.*;
public class PersonRepository {
    private HashMap<String,Person> map = new HashMap<>();

    public  Person findByName(String name) {
        return map.get(name);
    }
    public Person save(String name, Person person) {

        map.put(name,new Person(person.getName(),person.getNumber()));
        return person;
    }

    public String findAll() {
        return String.valueOf(map);
    }

}
