package me.chrisswr1.test.java8;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * unit test for main class
 *
 * @version 1.3.0
 * @since 1.3.0
 */
public class Java8AppTest {
	/**
	 * simple math function to calculate factorial sum
	 *
	 * @param count the last integer of the factorial sum
	 *
	 * @return the factorial sum
	 *
	 * @since 1.3.0
	 */
	public static int factorial(int count) {
		int sum = 0;
		for (int i = 1; i <= count; i++) {
			sum += i;
		}
		return sum;
	}

	/**
	 * basic test, which is always true
	 *
	 * @since 1.3.0
	 */
	@Test
	public void testHelloWorld() {
		Assertions.assertEquals("Hello World!", Java8App.helloWorld());
	}

	/**
	 * tests the Java 8 forEach feature
	 *
	 * @since 1.3.0
	 */
	@Test
	public void testForEach() {
		final int testCount = 10;
		for (int i = 0; i < testCount; i++) {
			Assertions.assertEquals(
				Java8AppTest.factorial(i),
				Java8App.forEach(i)
			);
		}
	}
}
