package com.lm2a.game;

public class GameLauncher {

    public static void main(String[] args) {
        GuessGame guessGame = new GuessGame();
        guessGame.startGame(new Player("Javier"), new Player("Pedro"),new Player("Luis"));
    }
}
