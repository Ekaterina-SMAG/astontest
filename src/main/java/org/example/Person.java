package org.example;

public class Person {
    String fullName;
    String position;
    String email;
    String phone;
    int salary;
    int age;

    public Person(String fullName, String position, String email, String phone, int salary, int age) {
        fullName = fullName;
        position = position;
        email = email;
        phone = phone;
        salary = salary;
        age = age;

        System.out.println("Полное имя сотрудника (ФИО): " + fullName + " Должность: " + position + " Email: " + email + " Телефон: " + phone + " Заработная плата: " + salary + " Возраст: " + age);
    }


}
