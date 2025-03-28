package com.lm2a.game;

public class Player {

    private int number;
    private String name;

    public Player(String playerName) {
        this.name = playerName;
    }

    public int guess(){
        number = (int)(Math.random()*10);
        return number;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }
}
