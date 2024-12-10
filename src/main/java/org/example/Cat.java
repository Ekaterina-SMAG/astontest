package org.example;

public class Cat extends Animal {
    @Override
    public void run(int length){
        if(length <= 200) {
            System.out.println("Кот может бежать расстояние равное 200 метров");
        }else{
            System.out.println("Введите расстояние");
        }
    }

    @Override
    public void swim(int length) {
        if (length <= 10) {
            System.out.println("Кот не умеет плавать");
        }
        }
    }

}
