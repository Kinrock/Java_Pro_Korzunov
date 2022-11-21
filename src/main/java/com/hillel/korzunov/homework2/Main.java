package com.hillel.korzunov.homework2;

public class Main {
    public static void main(String[] args) {

        Cat cat1 = new Cat("Murzik");
        cat1.run(140);
        cat1.run(-140);
        cat1.run(1140);
        cat1.swim(5);

       Dog dog1 = new Dog("Jack");
       dog1.run(250);
       dog1.run(-250);
       dog1.run(1250);
       dog1.swim(5);
       dog1.swim(-5);
       dog1.swim(15);

    }
}
