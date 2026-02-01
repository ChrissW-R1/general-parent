package me.chrisswr1.test.mavenplugin;

import lombok.Getter;
import me.chrisswr1.test.App;
import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;
import org.jetbrains.annotations.Nullable;
import proguard.annotation.Keep;
import proguard.annotation.KeepName;

/**
 * goal which only response with a hello in the build log
 *
 * @version 3.0.48
 * @since 3.0.48
 */
@Mojo(
	name = "hello",
	defaultPhase = LifecyclePhase.INITIALIZE,
	threadSafe = true
)
@Keep
public class HelloWorldMojo
extends AbstractMojo {
	/**
	 * optional caller, which should be greeted in the log
	 *
	 * @since 3.0.48
	 */
	@Parameter
	@Getter
	@KeepName
	private @Nullable String caller;

	@Override
	public void execute() {
		this.getLog().info(App.hello(this.getCaller()));
	}
}
