package org.example.controller;

import org.example.entity.Person;
import org.example.service.PersonService;
import org.example.service.impl.PersonServiceImpl;

import java.util.Scanner;

public class PersonController {
    public void show() {
        char option;
        Scanner scanner = new Scanner(System.in);
        PersonService personService = new PersonServiceImpl();

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
                    System.out.println("Введи id");
                    String namekey = scanner.next();
                    System.out.println("Введи имя");
                    String name = scanner.next();
                    System.out.println("Введи номер телефона");
                    String number = scanner.next();
                    Person person = new Person(number, name);

                    System.out.println(personService.save(namekey,person));
                    break;
                case 'B':
                    System.out.println(personService.findAll());
                    break;
                case 'C':
                    System.out.println(personService.findByName(scanner.next()));
                    break;
                case 'D':
                    String name2 = scanner.next();
                    personService.getServiceContact(name2);
                    break;
                case 'F':
                    String name3 = scanner.next();
                    personService.logServiceContact(name3);
                    break;
                case 'J':
                    String name4 = scanner.next();
                    personService.getByName(name4);
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
