package me.chrisswr1.test.java17;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * unit test for main class
 *
 * @version 1.3.0
 * @since 1.3.0
 */
public class Java17AppTest {
	/**
	 * basic test, which is always true
	 *
	 * @since 1.3.0
	 */
	@Test
	public void testHelloWorld() {
		Assertions.assertEquals("Hello World!", Java17App.helloWorld());
	}
}
