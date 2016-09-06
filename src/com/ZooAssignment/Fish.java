package com.ZooAssignment;

public class Fish extends Animal {
    
    private boolean bottomFeeder = false;
    private boolean saltWater = false;
    private String livesWhere = null;
    private int fins = 0;
    
    public Fish(String name, String environment, String commonColor, boolean coldBlooded, boolean canFly,
            int numberOfLegs, boolean livesInWater, String methodOfTravel, String gender, float averageWeight,
            boolean laysEggs, boolean bottomFeeder, boolean saltWater, String livesWhere, int fins) {
        super(name, environment, commonColor, coldBlooded, canFly, numberOfLegs, livesInWater, methodOfTravel, gender,
                averageWeight, laysEggs);
        this.bottomFeeder = bottomFeeder;
        this.saltWater = saltWater;
        this.livesWhere = livesWhere;
        this.fins = fins;
    
    }

    public boolean isBottomFeeder() {
        return bottomFeeder;
    }

    public void setBottomFeeder(boolean bottomFeeder) {
        this.bottomFeeder = bottomFeeder;
    }

    public boolean isSaltWater() {
        return saltWater;
    }

    public void setSaltWater(boolean saltWater) {
        this.saltWater = saltWater;
    }

    public String getLivesWhere() {
        return livesWhere;
    }

    public void setLivesWhere(String livesWhere) {
        this.livesWhere = livesWhere;
    }

    public int getFins() {
        return fins;
    }

    public void setFins(int fins) {
        this.fins = fins;
    }

    @Override
    public String toString() {
        return " I saw a " + commonColor + " " + gender + " fish called a " + name + ". The " + name
                + " was in a special area of the zoo since they need " + livesWhere + " to live. A " + name + " will "
                + methodOfTravel + " through the " + environment + ". The average weight of a " + gender + " " + name
                + " is " + averageWeight + " lbs.";
    }
}
