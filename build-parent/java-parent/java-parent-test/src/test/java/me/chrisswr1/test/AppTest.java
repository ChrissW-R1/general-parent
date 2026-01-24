package me.chrisswr1.test;

import com.code_intelligence.jazzer.junit.FuzzTest;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * unit test for main class
 *
 * @version 3.0.40
 * @since 1.0.0
 */
public class AppTest {
	/**
	 * test of {@link App#helloWorld()}
	 *
	 * @since 1.0.0
	 */
	@Test
	public void testHelloWorld() {
		assertEquals("Hello World!", App.helloWorld());
	}

	/**
	 * test of {@link App#hello(String)} with given name
	 *
	 * @since 3.0.40
	 */
	@Test
	public void testHelloWithName() {
		assertEquals("Hello Alice!", App.hello("Alice"));
	}

	/**
	 * test of {@link App#hello(String)} with null caller
	 *
	 * @since 3.0.40
	 */
	@Test
	public void testHelloWithNullCaller() {
		assertEquals("Hello World!", App.hello(null));
	}

	/**
	 * test of {@link App#hello(String)} with empty caller
	 *
	 * @since 3.0.40
	 */
	@Test
	public void testHelloWithEmptyCaller() {
		assertEquals("Hello World!", App.hello(""));
	}

	/**
	 * fuzz test of {@link App#hello(String)}
	 *
	 * @param caller the name of the caller to greet
	 *
	 * @since 3.0.40
	 */
	@FuzzTest
	public void fuzzHello(final @Nullable String caller) {
		final @NotNull String nonEmptyCaller = (
			caller == null ||
			caller.isEmpty()
		) ? "World" : caller;

		assertEquals(
			"Hello " + nonEmptyCaller + "!",
			App.hello(caller)
		);
	}
}
