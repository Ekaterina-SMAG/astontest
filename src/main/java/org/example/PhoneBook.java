package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class PhoneBook {
    HashMap<String, List<String>> book;


    public PhoneBook() {
        book = new HashMap<>();
    }

    public void add(String surname, String phoneNumber) {

        List<String> phones = book.getOrDefault(surname, new ArrayList<>());

        phones.add(phoneNumber);

        book.put(surname, phones);
    }


    public List<String> get(String surname) {
        return book.getOrDefault(surname, new ArrayList<>());
    }

}

