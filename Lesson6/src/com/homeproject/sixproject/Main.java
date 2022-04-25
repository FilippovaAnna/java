package com.homeproject.sixproject;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat(" Мурзик ", " белый ", 4);
        Dog dog = new Dog(" Бобик ", " черный ", 8);

        System.out.println(cat.toString());
        System.out.println(dog.toString());

        cat.swim();
        dog.swim(10);

        cat.run(200);
        dog.run(500);
    }
}
