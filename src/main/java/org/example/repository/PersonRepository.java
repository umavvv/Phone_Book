package org.example.repository;

import org.example.entity.Person;

import java.util.*;

public class PersonRepository {
    Person persons = new Person();
    private Map<Long, Person> bd() {
        Map<Long, Person> map = new HashMap<>();
        map.put(1l, new Person("666", "service"));
        map.put(2l, new Person("112312", "notService"));
        return map;
    }

    public String findByName(String name) {
        for (Map.Entry<Long, Person> entry : bd().entrySet()) {
            Person value = entry.getValue();
            if (name.equals(value.getName())) {
                persons = value;
            }
        }
        return persons.getName();
    }
    public String save(Long id,Person persons) {
        bd().put(id,persons);
        return String.valueOf(persons);
    }
    public String findAll() {
        return String.valueOf(bd());
    }
}
