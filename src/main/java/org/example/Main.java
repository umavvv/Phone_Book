package org.example;

import org.example.entity.Person;
import org.example.repository.PersonRepository;
import org.example.service.Impl.PersonServiceImpl;
import org.example.service.PersonService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        char option;
        Scanner scanner = new Scanner(System.in);
        PersonRepository personRepository = new PersonRepository();
        PersonService personService = new PersonServiceImpl();

        System.out.println("A. Сохранить пользователя");
        System.out.println("B. Вывести всех пользователей");
        System.out.println("C. Найти по имени");
        System.out.println("D. Ищет имя в bd если не нашел то вернет номер по дефолту");
        System.out.println("F. Просто логи");
        System.out.println("C. Ищет имя в bd если не нашел то все плохо");
        ;
        System.out.println("E. Выход");
        do {
            System.out.println("Введите опцию");
            option = scanner.next().charAt(0);
            switch (option) {
                case 'A':
                    System.out.println("Введи id");
                    Long id = scanner.nextLong();
                    System.out.println("Введи имя");
                    String name = scanner.next();
                    System.out.println("Введи номер телефона");
                    String number = scanner.next();
                    Person person = new Person(number, name);
                    System.out.println(personRepository.save(id, person));
                    break;
                case 'B':
                    System.out.println(personRepository.findAll());
                    break;
                case 'C':
                    String name1 = scanner.next();
                    personService.findByName(name1);
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