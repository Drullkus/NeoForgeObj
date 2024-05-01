package com.example.examplemod;

import de.javagl.obj.Objs;

public class ClientTest {
	public static void init() {
		Objs.create();

		ExampleMod.LOGGER.info("Successfully called a method from a non-mod dependency!");
	}
}
