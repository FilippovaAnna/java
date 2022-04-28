package com.homeprogect.sevenproject;

import java.util.concurrent.Callable;

public class Main {
    public static void main(String[]args){
        Cat[] catArray = new Cat[3];
        catArray [0]= new Cat(" Барсик " , 15);
       catArray[1] = new Cat(" Мурзик " , 20);
         catArray[2] = new Cat(" Томас " , 25);

       Plate plate = new Plate(100);

       plate.info();
       catArray[0].eat(plate);
       plate.info();



        catArray[1].eat(plate);
        plate.info();




        catArray[2].eat(plate);
        plate.info();

        plate.increaseFood(65);
        plate.info();

        catArray[0].catHungry();
        catArray[1].catHungry();
        catArray[2].catHungry();
    }
}
