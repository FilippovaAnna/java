package com.homeprogect.sevenproject;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAppetite() {
        return appetite;
    }

    public boolean isSatiety() {
        return satiety;
    }

    public void setSatiety(boolean satiety) {
        this.satiety = satiety;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;

    }

    public Cat(String name, int appetite){
        this.name = name;
        this.appetite = appetite;
        this.satiety = false;
    }
    public void eat(Plate plate){
        if(plate.decreaseFood(appetite)){
            this.satiety = true;
        }

    }
    public void catHungry(){
        if(satiety = true){
            System.out.println(" Кот сытый ");
        }
    }
}
