package com.hillel.korzunov.homework2;

public class Dog extends Animal {

    int counter = 0;

    public int getCounter() {
        counter++;
        return counter;
    }

    public Dog(String name) {
        super(name);
    }

    @Override
    void swim(int length) {
        if (length<=10 && length >0){
            System.out.println("Dog " + getName() + " swam " + length + "meters.");
        } else {
            System.out.println("Dog cant swim " + length +" meters. It can swim from 0 to 10 meters.");
        }

    }

    @Override
    void run(int length) {
        if (length<=500 && length >0){
            System.out.println("Dog " + getName() + " ran " + length + " meters.");
        } else {
            System.out.println("Dog cant run " + length +" meters. It can run from 0 to 500 meters.");
        }
    }
}
