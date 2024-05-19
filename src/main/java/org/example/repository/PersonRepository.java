package org.example.repository;

import org.example.entity.Person;

import java.util.*;

public class PersonRepository {
    Person persons = new Person();
    public String findByName(String name) {
        List<Person> list1 = new ArrayList<>();
        list1.add(new Person(1, "service"));
        list1.add(new Person(1432, "w2"));
        for (Person person : list1) {
            if (name.equals(person.getName())) {
                persons=person;
            }
        }
        return persons.getName();
    }
}
