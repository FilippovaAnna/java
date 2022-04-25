package com.homeproject.sixproject;

public class Dog extends Animals {

    public Dog(String name, String color, int age) {
        super(name, color, age);
    }

    public void swim() {
        System.out.println(" Бобик проплыл 10 м.");
    }

    public void run(){
        System.out.println(" Бобик пробежал 500 м.");
    }
}
