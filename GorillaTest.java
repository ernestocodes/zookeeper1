package com.ernesto.zookeeper1;

public class GorillaTest {
	public static void main(String[] args) {
		Gorilla joe = new Gorilla();
		joe.throwSomething();
		joe.eatBananas();
		joe.climb();
		System.out.println(joe.displayEnergy());
	}
}
