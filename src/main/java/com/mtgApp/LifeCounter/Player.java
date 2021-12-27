package com.mtgApp.LifeCounter;

public class Player {

    private String playerName;
    private int playerId;
    private NumberCounter lifeCounter = new NumberCounter(playerId, 40, 0, false);
    private NumberCounter poisonCounter;

    public Player(String playerName, int playerId, NumberCounter lifeCounter) {
        this.playerName = playerName;
        this.playerId = playerId;
        this.lifeCounter = lifeCounter;
    }

    public String getPlayerName() {
        return this.playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getPlayerId() {
        return this.playerId;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    public NumberCounter getLifeCounter() {
        return this.lifeCounter;
    }

    public void setLifeCounter(NumberCounter lifeCounter) {
        this.lifeCounter = lifeCounter;
    }

    public void makePoisonCounter(int counternumber) {
        this.poisonCounter = new NumberCounter(counternumber, 0, 10, false);
    }

    public NumberCounter getPoisonCounter(int counternumber) {
        return poisonCounter;
    }

}
