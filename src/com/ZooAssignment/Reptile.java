package com.ZooAssignment;

public class Reptile extends Animal {
	
	private boolean scales = false;
	private boolean poisonous = false;
	private boolean blendsIn = false;
	private boolean claws = false;
	
	
	public Reptile(String name, String environment, String commonColor, boolean coldBlooded, boolean canFly,
			int numberOfLegs, boolean livesInWater, String methodOfTravel, String gender, float averageWeight,
			boolean laysEggs, boolean scales, boolean poisonous, boolean blendsIn, boolean claws) {
		super(name, environment, commonColor, coldBlooded, canFly, numberOfLegs, livesInWater, methodOfTravel, gender,
				averageWeight, laysEggs);
		this.scales = scales;
		this.poisonous = poisonous;
		this.blendsIn = blendsIn;
		this.claws = claws;
	}


	public boolean isScales() {
		return scales;
	}


	public void setScales(boolean scales) {
		this.scales = scales;
	}


	public boolean isPoisonous() {
		return poisonous;
	}


	public void setPoisonous(boolean poisonous) {
		this.poisonous = poisonous;
	}


	public boolean isBlendsIn() {
		return blendsIn;
	}


	public void setBlendsIn(boolean blendsIn) {
		this.blendsIn = blendsIn;
	}


	public boolean isClaws() {
		return claws;
	}


	public void setClaws(boolean claws) {
		this.claws = claws;
	}


	@Override
	public String toString() {
		return "It is " + scales + " that what I saw has scales and is " + poisonous + " that it was poisonous. It is " + blendsIn + " that the reptile blends in and is" + claws
				+ " that it has claws. The name of this reptile is " + name + " and it lives in the " + environment + ". The color of this reptile is " + commonColor + " and it is "
				+ coldBlooded + " that they are coldblooeded. It is " + canFly + " that it can fly and has " + numberOfLegs + " legs. It is "
				+ livesInWater + " that it lives in water and its preferred method of travels is " + methodOfTravel + " and its gender is " + gender + ". The average weight of this reptile is "
				+ averageWeight + " lbs and it is " + laysEggs + " that it lays eggs.";
	}
	
	
	
		

}
