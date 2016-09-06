package com.ZooAssignment;

public class Animal {

	    protected String name = null;
	    protected String environment = null;
	    protected String commonColor = null;
	    protected boolean coldBlooded = false;
	    protected boolean canFly = false;
	    protected int numberOfLegs = 0;
	    protected boolean livesInWater = false;
	    protected String methodOfTravel = null;
	    protected String gender = null;
	    protected float averageWeight = 0.0f;
	    protected boolean laysEggs = false;
	    
	    public Animal(String name, String environment, String commonColor, boolean coldBlooded, boolean canFly,
	            int numberOfLegs, boolean livesInWater, String methodOfTravel, String gender, float averageWeight,
	            boolean laysEggs) {
	        super();
	        this.name = name;
	        this.environment = environment;
	        this.commonColor = commonColor;
	        this.coldBlooded = coldBlooded;
	        this.canFly = canFly;
	        this.numberOfLegs = numberOfLegs;
	        this.livesInWater = livesInWater;
	        this.methodOfTravel = methodOfTravel;
	        this.gender = gender;
	        this.averageWeight = averageWeight;
	        this.laysEggs = laysEggs;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public String getEnvironment() {
	        return environment;
	    }

	    public void setEnvironment(String environment) {
	        this.environment = environment;
	    }

	    public String getCommonColor() {
	        return commonColor;
	    }

	    public void setCommonColor(String commonColor) {
	        this.commonColor = commonColor;
	    }

	    public boolean isColdBlooded(){
	    	return coldBlooded;
	    }

	    public void setColdBlooded(boolean coldBlooded) {
	        this.coldBlooded = coldBlooded;
	    }

	    public boolean isCanFly() {
	        return canFly;
	    }

	    public void setCanFly(boolean canFly) {
	        this.canFly = canFly;
	        
	    }

	    public int getNumberOfLegs() {
	        return numberOfLegs;
	    }

	    public void setNumberOfLegs(int numberOfLegs) {
	        this.numberOfLegs = numberOfLegs;
	    }

	    public boolean isLivesInWater() {
	        return livesInWater;
	    }

	    public void setLivesInWater(boolean livesInWater) {
	        this.livesInWater = livesInWater;
	    }

	    public String getMethodOfTravel() {
	        return methodOfTravel;
	    }

	    public void setMethodOfTravel(String methodOfTravel) {
	        this.methodOfTravel = methodOfTravel;
	    }

	    public String getGender() {
	        return gender;
	    }

	    public void setGender(String gender) {
	        this.gender = gender;
	    }

	    public float getAverageWeight() {
	        return averageWeight;
	    }

	    public void setAverageWeight(float averageWeight) {
	        this.averageWeight = averageWeight;
	    }

	    public boolean isLaysEggs() {
	        return laysEggs;
	    }

	    public void setLaysEggs(boolean laysEggs) {
	        this.laysEggs = laysEggs;
	    }
	    
	}

