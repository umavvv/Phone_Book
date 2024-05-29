package org.example;

import org.example.controller.PersonController;
import org.example.repository.impl.PersonRepositoryImpl;
import org.example.service.impl.PersonServiceImpl;

public class Main {
    public static void main(String[] args) {
        PersonController personController = new PersonController(new PersonServiceImpl(new PersonRepositoryImpl()));
        personController.show();
    }
}