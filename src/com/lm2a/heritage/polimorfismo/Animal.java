package com.lm2a.heritage.polimorfismo;

public class Animal {
    private String picture;
    private String food;
    private boolean hunger;
    private String boundaries;
    private String location;

    public Animal() {
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getBoundaries() {
        return boundaries;
    }

    public void setBoundaries(String boundaries) {
        this.boundaries = boundaries;
    }

    public boolean isHunger() {
        return hunger;
    }

    public void setHunger(boolean hunger) {
        this.hunger = hunger;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void makeNoise(){
        System.out.println("Animal making noise");
    }

    public void eat(){
        System.out.println("Animal eating");
    }

    public void sleep(){
        System.out.println("Animal sleeping");
    }

    public void roam(){
        System.out.println("Animal roaming");
    }

}
