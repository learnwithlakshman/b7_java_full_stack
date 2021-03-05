package com.careerit.cj.basics.keywords;

import java.util.concurrent.ThreadLocalRandom;

class DBConnection {

	// Allow only 3 connection objects

	private static DBConnection[] arr;
	public static int size = 10;
	static {
		arr = new DBConnection[size];
		for (int i = 0; i < size; i++) {
			arr[i] = new DBConnection();
		}

	}

	private DBConnection() {

	}

	public DBConnection getConnection() {
		return arr[ThreadLocalRandom.current().nextInt(0, size)];
	}

}

class TaskManager {
	private static TaskManager taskManager = null;

	private TaskManager() {
	}

	public static TaskManager getInstance() {
		if (taskManager == null) {
			taskManager = new TaskManager();
		}
		return taskManager;
	}
}

public class SingletonDemo {

	public static void main(String[] args) {
		TaskManager obj1 = TaskManager.getInstance();
		TaskManager obj2 = TaskManager.getInstance();
		TaskManager obj3 = TaskManager.getInstance();
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3);
	}
}
