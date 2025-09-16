package me.chrisswr1.test;

import lombok.extern.slf4j.Slf4j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * simple main class
 *
 * @version 3.0.0
 * @since 1.0.0
 */
@Slf4j
public class App {
	/**
	 * simple main method
	 *
	 * @param args arguments given by the console
	 *
	 * @since 1.0.0
	 */
	public static void main(final @Nullable String[] args) {
		final @NotNull String helloWorld = App.helloWorld();
		App.log.debug("Printing '{}'", helloWorld);
		System.out.println(helloWorld);
	}

	/**
	 * creates the "Hello World!" {@link String}
	 *
	 * @return a {@link String} with the "Hello World!" greeting
	 *
	 * @since 1.0.0
	 */
	public static @NotNull String helloWorld() {
		final @NotNull String helloWorld = "Hello World!";
		App.log.trace("Returning '{}'", helloWorld);
		return helloWorld;
	}
}
