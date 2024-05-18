package org.example.repository;

import org.example.entity.Person;

import java.util.*;
import java.util.stream.Collectors;

public class PersonRepository {

        public void findByName(String name) {

            List<Person> list1 = new ArrayList<>();
            list1.add(new Person(1, "service"));
            list1.add(new Person(1432, null));

            System.out.println(list1.contains(name));

        }
}