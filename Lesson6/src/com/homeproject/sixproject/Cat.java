package com.homeproject.sixproject;

public class Cat extends Animals{

    public Cat(String name, String color, int age) {
        super(name, color, age);
    }

    public void swim() {
        System.out.println(" Мурзик не умеет плавать");
    }

    public void run(){
        System.out.println(" Мурзик пробежал 200 м.");
    }
}
