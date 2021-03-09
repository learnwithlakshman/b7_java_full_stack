package com.careerit.cj.abstractcls;

import java.util.concurrent.ThreadLocalRandom;

abstract class Game {
	public void start() {
		System.out.println("The game : " + this.getClass().getSimpleName() + " is going to start");
	}

	public abstract void play();

	public void stop() {
		System.out.println("The game : " + this.getClass().getSimpleName() + " is going to stop");
	}
}

class Bike extends Game {

	@Override
	public void play() {
		System.out.println("You are playing :" + this.getClass().getSimpleName() + ", please wear Helmet");
	}

}

class Car extends Game {

	@Override
	public void play() {
		System.out.println("You are playing :" + this.getClass().getSimpleName() + ", please wear seat belt");
	}

}

class Ship extends Game {

	@Override
	public void play() {
		System.out.println("You are playing :" + this.getClass().getSimpleName() + ", please wear water jacket");
	}

}

public class GameManager {

	public static void main(String[] args) {
		Game game = getRandomGame();
		game.start();
		game.play();
		game.stop();
	}

	private static Game getRandomGame() {
		int num = ThreadLocalRandom.current().nextInt(1, 4);
		if (num == 1) {
			return new Bike();
		} else if (num == 2) {
			return new Car();
		} else if (num == 3) {
			return new Ship();
		}
		return new Bike();
	}
}
