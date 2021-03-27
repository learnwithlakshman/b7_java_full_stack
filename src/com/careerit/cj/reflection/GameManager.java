package com.careerit.cj.reflection;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

interface Game {
	void play();
}

class Car implements Game {

	@Override
	public void play() {
		System.out.println("You are playing car game");

	}

}

class Ship implements Game {

	@Override
	public void play() {
		System.out.println("You are playing Ship game");

	}

}

class Bike implements Game {

	@Override
	public void play() {

		System.out.println("You are playing bike game");
	}

}



public class GameManager {

	public static void main(String[] args) {
		Game g = getGameInstance();
		g.play();
	}

	private static Game getGameInstance() {
		Properties properties = new Properties();
		Game game = null;
		try {
			properties.load(new FileInputStream("data/game.properties"));
			String clsName = properties.getProperty("game");
			Class<?> cls = Class.forName(clsName);
			Object obj = cls.newInstance();
			if (obj instanceof Game) {
				game = (Game) obj;
			}
		} catch (IOException | ClassNotFoundException | InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		}
		return game;
	}
}
