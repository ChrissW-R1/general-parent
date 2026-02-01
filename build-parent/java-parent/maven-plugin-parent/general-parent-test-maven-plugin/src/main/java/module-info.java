/**
 * this module tests the {@code maven-plugin-parent} project
 * with sample source code
 *
 * @since 3.0.48
 */
module me.chrisswr1.test.mavenplugin {
	requires static org.jetbrains.annotations;
	requires static proguard.annotations;
	requires static lombok;

	requires maven.plugin.api;
	requires maven.plugin.annotations;
	requires me.chrisswr1.test;
}
