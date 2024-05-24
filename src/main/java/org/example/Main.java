package org.example;

import org.example.controller.PersonController;
import org.example.entity.Person;
import org.example.repository.impl.PersonRepository;
import org.example.service.impl.PersonServiceImpl;
import org.example.service.PersonService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PersonController personController = new PersonController();
        personController.show();
    }
}