package com.mtgApp.LifeCounter.entity;

public class NumberCounter {

    private int counterID;
    private int startingValue;
    private int lethalValue;
    private Boolean isLethal;
    private String CounterName;

    public NumberCounter(int counterID, int startingValue, int lethalValue, Boolean isdead, String CounterName) {
        this.counterID = counterID;
        this.startingValue = startingValue;
        this.lethalValue = lethalValue;
        this.isLethal = isdead;
        this.CounterName = CounterName;
    }

    public int getCounterID() {
        return this.counterID;
    }

    public void setCounterID(int counterID) {
        this.counterID = counterID;
    }

    public int getStartingValue() {
        return this.startingValue;
    }

    public void setStartingValue(int startingValue) {
        this.startingValue = startingValue;
    }

    public int getLethalValue() {
        return this.lethalValue;
    }

    public void setLethalValue(int lethalValue) {
        this.lethalValue = lethalValue;
    }

    public Boolean getIsLethal() {
        return this.isLethal;
    }

    public void setIsLethal(Boolean isdead) {
        this.isLethal = isdead;
    }

    public String getCounterName() {
        return this.CounterName;
    }

    public void setCounterName(String CounterName) {
        this.CounterName = CounterName;
    }

}