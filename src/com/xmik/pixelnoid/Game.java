package com.xmik.pixelnoid;

public class Game {
	private static Boolean running = false;

	public static void start() {
		running = true;
		gameLoop();
	}

	private static void gameLoop() {
		while (running == true) {
			running = false;
		}
	}
}
