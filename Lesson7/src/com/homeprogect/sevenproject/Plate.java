package com.homeprogect.sevenproject;

public class Plate {
    private int food;

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public Plate (int food){
        this.food = food;
    }
    public void info(){
        System.out.println(" Current food amount is "  + food);
    }
    public boolean decreaseFood(int amount){
        if ((food-amount) < 0){
            return false;
        }
        food -= amount;
        return true;
    }
    public void increaseFood(int amount){
        food += amount;

    }



}
