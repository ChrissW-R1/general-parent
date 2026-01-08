/**
 * this module tests the java-parent project with sample source code
 *
 * @version 3.0.15
 * @since 3.0.15
 */
module me.chrisswr1.test {
	requires static org.jetbrains.annotations;
	requires static lombok;

	requires org.slf4j;

	exports me.chrisswr1.test;
}
