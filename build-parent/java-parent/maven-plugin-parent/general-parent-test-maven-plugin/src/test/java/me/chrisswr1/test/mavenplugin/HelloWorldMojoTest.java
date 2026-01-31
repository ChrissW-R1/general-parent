package me.chrisswr1.test.mavenplugin;

import org.apache.maven.plugin.Mojo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

/**
 * unit tests for main {@link Mojo}
 *
 * @version 3.0.48
 * @since 3.0.48
 */
public class HelloWorldMojoTest {
	/**
	 * tests if execute does not throw any {@link Exception}
	 *
	 * @since 3.0.48
	 */
	@Test
	public void testExecute() {
		assertDoesNotThrow(() -> (new HelloWorldMojo()).execute());
	}
}
