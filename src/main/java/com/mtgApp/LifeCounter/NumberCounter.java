package com.mtgApp.LifeCounter;

public class NumberCounter {

    private int counterID;
    private int startingValue;
    private int lethalValue;
    private Boolean isLethal;

    public NumberCounter(int counterID, int startingValue, int lethalValue, Boolean isdead) {
        this.counterID = counterID;
        this.startingValue = startingValue;
        this.lethalValue = lethalValue;
        this.isLethal = isdead;
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

}