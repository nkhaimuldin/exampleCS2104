package com.company;

public class Horse extends Animal{

    public Horse(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("I-go-go");
    }

    @Override
    public String toString() {
        return "Horse name " + getName();
    }
}
