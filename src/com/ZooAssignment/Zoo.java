package com.ZooAssignment;

import java.util.ArrayList;

public class Zoo {
	public static void main(String[] args) {
		
		
		ArrayList<Animal> animalList = new ArrayList<>() ;{
			
			Mammal Dog = new Mammal("Dog", "park", "brown", false, false, 4, false, "walk", "female", 50.0f, false, "fur", "kibble");
			Mammal Kangaroo = new Mammal("Kangaroo", "Outback", "brown", false, false, 2, false, "hop", "male", 100.0f, false, "fur", "veggies");
			Fish Catfish = new Fish("Catfish", "dirty water", "gray", true, false, 0, true, "swim", "male", 10.0f, true, true, false, "stream", 3);
			Fish GreatWhiteShark = new Fish("Greak White Shark", "ocean", "white", true, false, 0, true, "swim", "male", 100.0f, false, false, true, "deep ocean waters", 3);
			Reptile RattleSnake = new Reptile("Rattle Snake", "desert", "brown", true, false, 0, false, "slithers", "female", 2.0f, true, true, true, true, false);
			Reptile Alligator = new Reptile("Alligator", "swamp", "green", true, false, 4, false, "swims and crawls", "male", 75.0f, true, true, false, true, true);
			Bird Penguin = new Bird("Penguin", "south pole", "black and white", true, false, 2, false, "swmim and waddle", "male", 15.0f, true, true, true, true);
			Bird Oriole = new Bird("Orioles", "Camden Yards", "orange and black", true, true, 2, false, "flys", "male", 2.0f, true, true, true, true);
			Insect Spider = new Insect("spider", "forest", "black", true, false, 8, false, "creeps", "male", 0.2f, true, false, true, false);
			Insect Bee = new Insect("Bee", "beehive", "yellow and black", true, true, 6, false, "flys", "female", 0.1f, true, false, false, true);
			
			animalList.add(Dog);
			animalList.add(Kangaroo);
			animalList.add(Catfish);
			animalList.add(GreatWhiteShark);
			animalList.add(RattleSnake);
			animalList.add(Alligator);
			animalList.add(Penguin);
			animalList.add(Oriole);
			animalList.add(Spider);
			animalList.add(Bee);
			
			
			
	//		System.out.print("Today at the Zoo I saw a number of animals. Let me tell you about what I saw.") ;
	//				System.out.println((animalList.get(7)));
			
			for(int i = 0; i < animalList.size(); i++){  //currently the reptile class has not been formatted to print out properly.
		           System.out.println(animalList.get(i));
		           System.out.println(" "); //space between the animals
}
}
}
}