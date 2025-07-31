package me.chrisswr1.test.webapp;

import jakarta.servlet.Servlet;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import me.chrisswr1.test.App;
import org.jetbrains.annotations.Nullable;

import java.io.IOException;

/**
 * {@link Servlet}, which handles all {@link HttpServletRequest}s
 * on the root path
 *
 * @version 2.5.0
 * @since 1.0.0
 */
@Slf4j
@WebServlet(
	description = "handles the HTTP request",
	urlPatterns = {"/*"}
)
public class MainServlet
extends BaseServlet {
	/**
	 * serial version unique identifier
	 *
	 * @since 1.0.0
	 */
	@Getter
	private static final long serialVersionUID = 1;

	@Override
	protected void doRequest(
		final @Nullable HttpServletRequest request,
		final @Nullable HttpServletResponse response
	) throws IOException {
		MainServlet.log.trace("Handling request: {}", request.getRequestURI());
		response.getWriter().println(App.helloWorld());
	}
}
