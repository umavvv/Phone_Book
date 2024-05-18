package org.example.service;

import java.util.Optional;

public interface PersonService {
    Optional<String> findByName(String name);

    String getByName(String name);
    void getServiceContact(String name);
    void logServiceContact(String name);
}
