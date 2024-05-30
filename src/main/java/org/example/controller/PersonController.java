package org.example.controller;

import org.example.entity.Person;
import org.example.service.PersonService;

import java.util.Scanner;

public class PersonController {
    private final Scanner scanner = new Scanner(System.in);
    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    public void save() {
        System.out.println("Введи имя");
        String name = scanner.next();
        System.out.println("Введи номер телефона");
        String number = scanner.next();
        System.out.println("Введи email");
        String gmail = scanner.next();
        Person person = new Person(number, gmail);
        System.out.println(personService.save(name, person));
    }

    public void findAll() {
        System.out.println(personService.findAll());
    }

    public void findByName() {
        System.out.println(personService.findByName(scanner.next()));
    }

    public void getServiceContact() {
        String name = scanner.next();
        personService.getServiceContact(name);
    }

    public void logServiceContact() {
        String name = scanner.next();
        personService.logServiceContact(name);
    }

    public void getByName() {
        String name = scanner.next();
        personService.getByName(name);
    }

    public void show() {
        char option;
        System.out.println("A. Сохранить пользователя");
        System.out.println("B. Вывести всех пользователей");
        System.out.println("C. Найти по имени");
        System.out.println("D. Ищет имя в bd если не нашел то вернет номер по дефолту");
        System.out.println("F. Просто логи");
        System.out.println("J. Ищет имя в bd если не нашел то все плохо");
        System.out.println("E. Выход");
        do {
            System.out.println("Введите опцию");
            option = scanner.next().charAt(0);
            switch (option) {
                case 'A':
                    save();
                    break;
                case 'B':
                    findAll();
                    break;
                case 'C':
                    findByName();
                    break;
                case 'D':
                    getServiceContact();
                    break;
                case 'F':
                    logServiceContact();
                    break;
                case 'J':
                    getByName();
                    break;
                case 'E':
                    System.out.println("Выход");
                    break;
                default:
                    System.out.println("Не корректное выражение");
                    break;
            }
        }
        while (option != 'E');
        System.out.println("До встречи!");
    }
}
