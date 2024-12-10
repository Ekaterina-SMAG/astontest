package org.example;

public class Animal {
    String animal;
    int run;
    int swim;

    public Animal(String animal, int run, int swin) {
        animal = animal;
        run = run;
        swim = swim;
        System.out.println("Животное" + animal + "бегает и " + run + "плавает." + swim);
    }

    public void run(int length){
    }

    public void swim(int length) {
    }
}
