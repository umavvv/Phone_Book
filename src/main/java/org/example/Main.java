package org.example;
import org.example.service.Impl.PersonServiceImpl;
import org.example.service.PersonService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String f =  scanner.next();
        PersonService personService = new PersonServiceImpl();

        personService.findByName(f);
        personService.getServiceContact(f);
        personService.logServiceContact(f);
        personService.getByName(f);


    }
}