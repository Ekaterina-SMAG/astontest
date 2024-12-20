package org.example;

import java.util.HashMap;



//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Задание 1 к Лекции 13

        HashMap<String, Integer> wordCount = new HashMap<>();

        wordCount.put("butter", wordCount.getOrDefault("butter", 0) + 1);
        wordCount.put("milk", wordCount.getOrDefault("milk", 0) + 1);
        wordCount.put("butter", wordCount.getOrDefault("butter", 0) + 1);
        wordCount.put("chicken", wordCount.getOrDefault("chicken", 0) + 1);
        wordCount.put("milk", wordCount.getOrDefault("milk", 0) + 1);
        wordCount.put("fish", wordCount.getOrDefault("fish", 0) + 1);
        wordCount.put("chicken", wordCount.getOrDefault("chicken", 0) + 1);
        wordCount.put("milk", wordCount.getOrDefault("milk", 0) + 1);
        wordCount.put("chocolate", wordCount.getOrDefault("chocolate", 0) + 1);
        wordCount.put("fish", wordCount.getOrDefault("fish", 0) + 1);
        wordCount.put("butter", wordCount.getOrDefault("butter", 0) + 1);
        wordCount.put("pear", wordCount.getOrDefault("pear", 0) + 1);
        wordCount.put("chocolate", wordCount.getOrDefault("chocolate", 0) + 1);
        wordCount.put("peach", wordCount.getOrDefault("peach", 0) + 1);
        wordCount.put("cake", wordCount.getOrDefault("cake", 0) + 1);
        wordCount.put("fish", wordCount.getOrDefault("fish", 0) + 1);
        wordCount.put("apple", wordCount.getOrDefault("apple", 0) + 1);
        wordCount.put("milk", wordCount.getOrDefault("milk", 0) + 1);
        wordCount.put("chocolate", wordCount.getOrDefault("chocolate", 0) + 1);


        System.out.println("Уникальные слова и их количество:");
        for (HashMap.Entry<String, Integer> entry : wordCount.entrySet())
            System.out.println(entry.getKey() + ": " + entry.getValue());






        //Задание 2 к Лекции 13

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Иванов", "123-45-67");
        phoneBook.add("Иванов", "765-43-21");
        phoneBook.add("Петров", "234-56-78");
        phoneBook.add("Сидоров", "345-67-89");

        System.out.println("Телефоны Иванова: " + phoneBook.get("Иванов"));
        System.out.println("Телефоны Петрова: " + phoneBook.get("Петров"));
        System.out.println("Телефоны Сидорова: " + phoneBook.get("Сидоров"));
        System.out.println("Телефоны Смирнова: " + phoneBook.get("Смирнов"));
    }


}





