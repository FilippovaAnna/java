package com.homeproject.freeproject;

import java.util.Arrays;

public class freeApp {
    public static void main(String[] args) {
        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        int[] new_array = new int[array.length];
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) new_array[i] = 1;
            else new_array[i] = 0;
        }
        System.out.println(Arrays.toString(new_array));

        int[] array1 = new int[100];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = i;

        }
        System.out.println(Arrays.toString(array1));


        int[] array2 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int[] new_array2 = new int[array2.length];
        System.out.println(Arrays.toString(array2));

        for (int i = 0; i < array2.length; i++) {
            if (array2[i] < 6) {
                new_array2[i] = array2[i] * 2;
            }
        }
        System.out.println(Arrays.toString(new_array2));


        int dl = 10;
        int[][] table = new int[dl][dl];

        for (int x = 0; x < dl; x++) {
            System.out.println();
            for (int y = 0; y < dl; y++) {
                System.out.print(" " + table[x][y]);
            }
        }
        for (int x = 0; x < dl; x++) {
            for (int y = 0; y < dl; y++) {
                if (x == y) {
                    table[x][y] = 1;
                    table[x][(dl - y - 1)] = 1;
                }

            }
        }
        System.out.println();
        for (int x = 0; x < dl; x++) {
            System.out.println();
            for (int y = 0; y < dl; y++) {
                System.out.print(" " + table[x][y]);
            }
        }

        System.out.println();
        System.out.println("=== 5 ===");
        System.out.println(Arrays.toString(myArray(10,5)));
    }

    public static int[] myArray(int len, int initialValue) {
        int[] array = new int[len];
        for(int i = 0; i < array.length; i ++){
            array[i] = initialValue;
        }
        return array;
    }
}

