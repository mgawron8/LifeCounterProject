package com.mtgApp.LifeCounter.entity;

import java.util.ArrayList;

public class Player {

    private String playerName;
    private int playerId;
    private NumberCounter lifeCounter = new NumberCounter(playerId, 40, 0, false, "Life");
    private NumberCounter poisonCounter;
    private ArrayList<NumberCounter> PlayerStatus = new ArrayList<NumberCounter>();
    private int counterNumber = 1;

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

    public void makePoisonCounter() {
        this.poisonCounter = new NumberCounter(counterNumber, 0, 10, false, "Poison");
    }

    public NumberCounter getPoisonCounter() {
        return poisonCounter;
    }

    public void addCounter(int lethalnumber, int startingnumber, Boolean isDead, String CounterName) {
        PlayerStatus.add(new NumberCounter(counterNumber, lethalnumber, startingnumber, isDead, CounterName));
        counterNumber++;
    }

    public void removeCounter() {
        PlayerStatus.remove(counterNumber);
        counterNumber--;
    }

}
