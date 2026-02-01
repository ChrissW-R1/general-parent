/**
 * this module tests the {@code webapp-parent} project with sample source code
 *
 * @since 3.0.15
 */
module me.chrisswr1.test.webapp {
	requires static org.jetbrains.annotations;
	requires static lombok;

	requires org.slf4j;
	requires jakarta.servlet;
	requires me.chrisswr1.test;
}
