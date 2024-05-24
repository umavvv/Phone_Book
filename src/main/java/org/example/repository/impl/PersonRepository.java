package org.example.repository.impl;

import org.example.entity.Person;

import java.util.*;

public class PersonRepository extends HashMap<Long,Person>{
    Person persons = new Person();
    public String findByName(String name) {
        for (Map.Entry<Long, Person> entry :entrySet()) {
            Person value = entry.getValue();
            if (name.equals(value.getName())) {
                persons = value;
            }
        }
        return persons.getName();
    }

}
