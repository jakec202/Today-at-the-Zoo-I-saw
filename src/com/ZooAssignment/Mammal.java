package com.ZooAssignment;

public class Mammal extends Animal{

    private String skin = null;
    private String eatsWhat = null;
    
    public Mammal(String name, String environment, String commonColor, boolean coldBlooded, boolean canFly,
            int numberOfLegs, boolean livesInWater, String methodOfTravel, String gender, float averageWeight,
            boolean laysEggs, String skin, String eatsWhat) {
        
        super(name, environment, commonColor, coldBlooded, canFly, numberOfLegs, livesInWater, methodOfTravel, gender,
                averageWeight, laysEggs);
        
        this.skin = skin;
        this.eatsWhat = eatsWhat;
    }

    public String getSkin() {
        return skin;
    }

    public void setSkin(String skin) {
        this.skin = skin;
    }

    public String getEatsWhat() {
        return eatsWhat;
    }

    public void setEatsWhat(String eatsWhat) {
        this.eatsWhat = eatsWhat;
    }

    @Override
    public String toString() {
        return " There was mammal that has " + skin + ", eats " + eatsWhat + ", called a " + name + ". They live in the " + environment
                + ", and are " + commonColor + ". I found out that it is " + coldBlooded +" that they are coldblooded. I also found out that it is " + canFly
                + " that they can fly. They have " + numberOfLegs + " legs but it is " + livesInWater + " that they live in the water. Their prefferred method of travel is to "
                + methodOfTravel + ". The one that I saw was " + gender + " and their average weight was " + averageWeight + " lbs. They lay eggs is another " + laysEggs
                + " statement.";
    } 
    
}
