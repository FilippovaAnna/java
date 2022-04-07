package com.homeproject.firstproject;

public class FirstApp {
    public static void  printThreeWords() {
        System.out.println("=== printThreeWords ===");
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    public static void checkSumSign() {
        System.out.println("=== checkSumSign ===");
        int a = 10;
        int b = 20;
        int c = a + b;
        if (c >= 0){
            System.out.println("Сумма положительная");

        } else {
            System.out.println("Сумма отрицательная");
        }
        System.out.println(c);

    }
    public static void printColor() {
        System.out.println("=== printColor ===");
        int value = 45;
        if (value <= 0) {
            System.out.println("Красный");
        }
        if ((value > 0) && (value <= 100)) {
            System.out.println("Желтый");
        }
        if (value > 100) {
            System.out.println("Зеленый");
        }
    }
        public static void compareNumbers() {
            System.out.println("=== compareNumbers ===");
            int a = 30;
            int b = 15;
            if (a >= b){
                System.out.println("a >= b");
            } else {
                System.out.println("a < b");
            }
        }
        public static void main(String[] args){
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

}
