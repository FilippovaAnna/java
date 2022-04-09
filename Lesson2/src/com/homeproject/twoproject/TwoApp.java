package com.homeproject.twoproject;

public class TwoApp {
    public static boolean firstMetod(int a, int b) {
        System.out.println("=== firstMetod ===");
        System.out.println("a="+a+" b="+b);
        int c = a + b;
        return (c >= 10) && (c <= 20);
    }

    public static void twoMetod(int a) {
        System.out.println("=== twoMetod ===");
        System.out.println("a="+a);
        if (a >= 0) {
            System.out.println("a >= 0");
        } else {
            System.out.println("a < 0");
        }

    }
    public static boolean threeMetod(int a) {
        System.out.println("=== threeMetod ===");
        System.out.println("a="+a);
        if (a < 0) {
            return true;
        } else {
            return false;
        }
    }
    public static void fourMetod(String s, int a) {
        System.out.println("=== fourMetod ===");
        for(int i=1; i<=a; i++) {
            System.out.println(s);
        }
    }



    public static void main(String[] args){
        System.out.println(firstMetod(5,3));
        System.out.println(firstMetod(7,8));
        twoMetod(3);
        twoMetod(-5);
        System.out.println(threeMetod(-6));
        System.out.println(threeMetod(15));
        fourMetod("строка для вывода",5);

    }

}