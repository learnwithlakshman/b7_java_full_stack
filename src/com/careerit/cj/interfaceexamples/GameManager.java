package com.careerit.cj.interfaceexamples;

import java.util.Scanner;

interface Game {
	void start();
	void play();
	void stop();
}

abstract class AbstractGame implements Game {
	public void start() {
		System.out.println("The game :" + this.getClass().getSimpleName() + " is going to start");
	}

	public void stop() {
		System.out.println("The game :" + this.getClass().getSimpleName() + " is going to stop");
	}
}

class Bike extends AbstractGame implements Game {
	public void play() {
		System.out.println("You are playing game : " + this.getClass().getSimpleName() + ", please wear helmet");
	}
}

class Car extends AbstractGame implements Game {

	public void play() {
		System.out.println("You are playing game : " + this.getClass().getSimpleName() + ", please wear seat belt");
	}


}

class Ship extends AbstractGame implements Game {


	public void play() {
		System.out.println("You are playing game : " + this.getClass().getSimpleName() + ", please wear water jacket");
	}

	
}

interface One{
	void m1();
	// few more method
}
interface Two {
	void m1();
	void m2();
}
interface Three {
	void m3();
	void m2();
	
}
class C1 implements One,Two,Three{

	@Override
	public void m3() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}

	
}

public class GameManager {

	public static void main(String[] args) {
	
	
		Scanner sc = new Scanner(System.in);
		System.out.println("1.Bike 2.Car 3.Ship");
		int choice = sc.nextInt();
		Game game = getGameInstance(choice);
		game.start();
		game.play();
		game.stop();
		sc.close();

	}

	private static Game getGameInstance(int choice) {
		if (choice == 1) {
			return new Bike();
		} else if (choice == 2) {
			return new Car();
		} else if (choice == 3) {
			return new Ship();
		}

		return new Bike();
	}
}
