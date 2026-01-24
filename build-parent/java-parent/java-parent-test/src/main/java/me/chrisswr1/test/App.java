package me.chrisswr1.test;

import lombok.extern.slf4j.Slf4j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * simple main class
 *
 * @version 3.0.40
 * @since 1.0.0
 */
@Slf4j
public class App {
	/**
	 * default caller name
	 *
	 * @since 3.0.40
	 */
	private static final @NotNull String DEFAULT_CALLER = "World";

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
	 * creates a {@link String} to greet a caller
	 *
	 * @param caller the name of the caller to greet
	 * @return a {@link String} greeting to the caller
	 *
	 * @since 3.0.40
	 */
	public static @NotNull String hello(
		final @Nullable String caller
	) {
		App.log.trace("Given caller: '{}'", caller);
		final @NotNull String nonNullCaller;
		if (caller != null && !(caller.isEmpty())) {
			App.log.trace("Caller is given as '{}'", caller);
			nonNullCaller = caller;
		} else {
			App.log.trace(
				"No caller is given! Use default caler: '{}'",
				App.DEFAULT_CALLER
						 );
			nonNullCaller = App.DEFAULT_CALLER;
		}
		App.log.trace("Create greeting for caller: '{}'", nonNullCaller);
		final @NotNull String hello = "Hello " + nonNullCaller + "!";
		App.log.trace("Returning greeting '{}'", hello);
		return hello;
	}

	/**
	 * creates the "Hello World!" {@link String}
	 *
	 * @return a {@link String} with the "Hello World!" greeting
	 *
	 * @since 1.0.0
	 */
	public static @NotNull String helloWorld() {
		App.log.trace("Create greeting of the world");
		final @NotNull String helloWorld = App.hello(null);
		App.log.trace("Returning greeting '{}'", helloWorld);
		return helloWorld;
	}
}
