package com.ZooAssignment;

public class Insect extends Animal {
    
    private boolean vertebrae = false;
    private boolean spinsWeb = false;
    private boolean pollinatesPlants = false;
    
    public Insect(String name, String environment, String commonColor, boolean coldBlooded, boolean canFly,
            int numberOfLegs, boolean livesInWater, String methodOfTravel, String gender, float averageWeight,
            boolean laysEggs, boolean vertebrae, boolean spinsWeb, boolean pollinatesPlants) {
        super(name, environment, commonColor, coldBlooded, canFly, numberOfLegs, livesInWater, methodOfTravel, gender,
                averageWeight, laysEggs);
        this.vertebrae = vertebrae;
        this.spinsWeb = spinsWeb;
        this.pollinatesPlants = pollinatesPlants;
    }

    public boolean isVertebrae() {
        return vertebrae;
    }

    public void setVertebrae(boolean vertebrae) {
        this.vertebrae = vertebrae;
    }

    public boolean isSpinsWeb() {
        return spinsWeb;
    }

    public void setSpinsWeb(boolean spinsWeb) {
        this.spinsWeb = spinsWeb;
    }

    public boolean isPollinatesPlants() {
        return pollinatesPlants;
    }

    public void setPollinatesPlants(boolean pollinatesPlants) {
        this.pollinatesPlants = pollinatesPlants;
    }

    @Override
    public String toString() {
        return  "I saw an insect that we call a " + name + ". It was a " + commonColor + " " + gender + " " + name
                + " with " + numberOfLegs + " legs. A " + name + " " + methodOfTravel + " through " + environment
                + " where it lives. The common ideas that a " + name + " spins webs and pollinates flowers are "
                + spinsWeb + " and " + pollinatesPlants + ", respectively.The average weight of a " + gender + " "
                + name + " is " + averageWeight + " lbs.";
    } 
    

}
