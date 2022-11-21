package com.hillel.korzunov.homework2;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    void swim(int length) {
        System.out.println("Cats cant swim.");
    }

    @Override
    void run(int length) {

        if (length <= 200 && length > 0) {
            System.out.println("Cat " + getName() + " ran " + length + " meters.");
        } else {
            System.out.println("Cat cant run " + length + ". It can run from 0 to 200 meters.");
        }
    }
}
