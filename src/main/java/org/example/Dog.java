package org.example;

public class Dog extends Animal {
    @Override
    public void run(int length) {
        if (length <= 500) {
            System.out.println("Собака может бежать расстояние равное 500 метров");
        } else {
            System.out.println("Введите расстояние");
        }
    }

    @Override
    public void swim(int length) {
        if (length <= 10) {
            System.out.println("Собака может проплыть расстояние 10 м");
        }
    }
}
