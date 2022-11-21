package com.hillel.korzunov.homework2;

public abstract class Animal {
     private String name;


    public String getName() {
        return name;
    }

    public Animal(String name) {
        this.name = name;
    }
    abstract void swim(int length);
    abstract void run(int length);

}
