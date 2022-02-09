package com.company;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();

        animals.add(new Cat("Tom"));
        animals.add(new Dog("Rex"));
        animals.add(new Horse("Candy"));


        for (Animal animal : animals){
            System.out.print(animal.getName() + " says ");
            animal.makeSound();
        }
    }
}
