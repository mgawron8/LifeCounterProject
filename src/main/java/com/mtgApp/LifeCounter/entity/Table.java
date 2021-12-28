package com.mtgApp.LifeCounter.entity;

import java.util.ArrayList;

import com.mtgApp.LifeCounter.entity.NumberCounter;
import com.mtgApp.LifeCounter.entity.Player;

public class Table {

    private ArrayList<Player> playerList = new ArrayList<Player>();
    private int playerId = 1;
    private int counterNumber = 1;

    public void addPlayer() {
        playerList.add(new Player("player1", playerId, new NumberCounter(counterNumber, 40, 0, false, "Life")));
        playerId++;
        counterNumber++;
    }

    public void removePlayer() {
        playerList.remove(playerId);
        playerId--;
    }

}
