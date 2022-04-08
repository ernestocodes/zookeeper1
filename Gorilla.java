package com.ernesto.zookeeper1;

public class Gorilla extends Mammal {
	
	public void throwSomething() {
		this.energyLevel -= 5;
		System.out.println("Watch out! The Gorilla thre something at you and used up 5 energy!");
	}
	
	public void eatBananas() {
		this.energyLevel += 10;
		System.out.println("Looks like the Gorilla ate a banana and gained 10 energy. Yummy~");
	}
	
	public void climb() {
		this.energyLevel -= 10;
		System.out.println("The Gorilla quickly climbed the tree! It lost 10 energy~!");
	}
}