package com.ZooAssignment;

public class Bird extends Animal {
	
	private boolean talons = false;
	private boolean beak = true;
	private boolean feathers = true;
	
	
	public Bird(String name, String environment, String commonColor, boolean coldBlooded, boolean canFly,
			int numberOfLegs, boolean livesInWater, String methodOfTravel, String gender, float averageWeight,
			boolean laysEggs, boolean talons, boolean beak, boolean feathers) {
		super(name, environment, commonColor, coldBlooded, canFly, numberOfLegs, livesInWater, methodOfTravel, gender,
				averageWeight, laysEggs);
		this.talons = talons;
		this.beak = beak;
		this.feathers = feathers;
	}


	public boolean isTalons() {
		return talons;
	}


	public void setTalons(boolean talons) {
		this.talons = talons;
	}


	public boolean isBeak() {
		return beak;
	}


	public void setBeak(boolean beak) {
		this.beak = beak;
	}


	public boolean isFeathers() {
		return feathers;
	}


	public void setFeathers(boolean feathers) {
		this.feathers = feathers;
	}


	@Override
	public String toString() {
		return " I discovered that it is " + talons + " that all birds have talons and it is also " + beak + " that all birds have beaks. Another " + feathers + " statement is all birds have feathers. " + name
				+ "s live in the " + environment + " and their colors are " + commonColor + ". Since it is " + coldBlooded
				+ " that all birds are cold blooded they are cold blooded. It is " + canFly + " that they can fly but they have " + numberOfLegs + " legs. It is " + livesInWater
				+ " that they live in water but their preferred method of travel is to " + methodOfTravel + ". The bird I saw was " + gender + " with an average weight of " + averageWeight
				+ ". As is the case with all birds it is " + laysEggs + " that they lay eggs.";
	}
	
	
	

	

	
		
	}
	
	


