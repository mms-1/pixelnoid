package com.xmik.pixelnoid;

import java.nio.file.*; /* Hello from codenvy */

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello Arkanoid!");
		
		/* TODO Somehow check if it does anything */
		if (System.getProperty("org.lwjgl.librarypath") == null) {
			Path path = Paths.get("native");
			String librarypath = path.toAbsolutePath().toString();
			System.setProperty("org.lwjgl.librarypath", librarypath);
		}
		
		new Test().run();
	}

}
