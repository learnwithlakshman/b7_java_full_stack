package com.careerit.cj.cbook;

public final class IdGenerator {

	private static int id = 1001;

	private IdGenerator() {

	}

	public static int newId() {
		return id++;
	}
}
