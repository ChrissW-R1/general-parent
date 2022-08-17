package me.chrisswr1.test.exe;

import me.chrisswr1.test.App;

/**
 * class to wrap the {@link App} class into an Windows executable
 *
 * @version 1.0.0
 * @since 1.0.0
 */
public class WrappedApp {
	/**
	 * simple main method
	 *
	 * @param args arguments given by the console
	 *
	 * @see App#main(String[])
	 *
	 * @since 1.0.0
	 */
	public static void main(String[] args) {
		App.main(args);
	}
}
