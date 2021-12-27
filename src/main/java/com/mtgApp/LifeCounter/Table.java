package com.mtgApp.LifeCounter;

public class Table {

    private Player[] playerList;
    private int playerId = 1;
    private int counterNumber = 1;

    public void addPlayer() {
        playerList[playerId - 1] = new Player("player1", playerId, new NumberCounter(counterNumber, 40, 0, false));
        playerId++;
        counterNumber++;
    }

    public void removePlayer() {
        playerList[playerId - 1] = null;
        playerId--;
    }

}
