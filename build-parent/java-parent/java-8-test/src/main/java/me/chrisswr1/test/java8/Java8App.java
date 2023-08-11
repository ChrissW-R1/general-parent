package me.chrisswr1.test.java8;

import java.util.ArrayList;
import java.util.List;

/**
 * simple main class
 *
 * @version 1.3.0
 * @since 1.3.0
 */
public class Java8App {
	/**
	 * simple main method
	 *
	 * @param args arguments given by the console
	 *
	 * @since 1.3.0
	 */
	public static void main(String[] args) {
		System.out.println(Java8App.helloWorld());
	}

	/**
	 * creates the "Hello World!" {@link String}
	 *
	 * @return a {@link String} with the "Hello World!" greeting
	 *
	 * @since 1.3.0
	 */
	public static String helloWorld() {
		return "Hello World!";
	}

	/**
	 * sums all integer until given count with forEach method
	 *
	 * @param count the last integer to add
	 *
	 * @return the sum of all integers from 1 to count
	 *
	 * @since 1.3.0
	 */
	public static int forEach(final int count) {
		List<Integer> intList = new ArrayList<>();

		for (int i = 1; i <= count; i++) {
			intList.add(i);
		}

		int sum = 0;
		for (int i : intList) {
			sum += i;
		}

		return sum;
	}
}
