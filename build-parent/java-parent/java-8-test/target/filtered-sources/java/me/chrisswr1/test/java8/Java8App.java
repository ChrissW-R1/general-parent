package me.chrisswr1.test.java8;

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

	public static int forEach() {
		List<Integer> intList = new ArrayList<>();
	}
}
