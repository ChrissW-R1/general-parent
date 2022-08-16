package me.chrisswr1.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * unit test for main class
 *
 * @since 1.0.0
 */
public class AppTest {
	/**
	 * basic test, which is always true
	 *
	 * @since 1.0.0
	 */
	@Test
	public void testHelloWorld() {
		Assertions.assertEquals("Hello World!", App.helloWorld());
	}
}
