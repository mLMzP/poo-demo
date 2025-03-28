package com.lm2a.game;

public class GuessGame {

    Player p1;
    Player p2;
    Player p3;

    public void startGame(Player p1, Player p2, Player p3){
//        p1 = new Player();
//        p2 = new Player();
//        p3 = new Player();
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;

        int targetNumber = (int)(Math.random()*10);

        boolean somebodyGuessed = false;

        if(targetNumber == p1.guess()){
            System.out.println(p1.getName()+" guessed!");
            somebodyGuessed = true;
        }
        if(targetNumber == p2.guess()){
            System.out.println(p2.getName()+" guessed!");
            somebodyGuessed = true;
        }
        if(targetNumber == p3.guess()){
            System.out.println(p3.getName()+" guessed!");
            somebodyGuessed = true;
        }
        if(!somebodyGuessed){
            System.out.println("Nobody guessed!");
        }
    }

}
