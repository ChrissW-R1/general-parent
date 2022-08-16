package me.chrisswr1.test;

import lombok.Getter;

import javax.servlet.Servlet;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * {@link Servlet}, which handles all {@link HttpServletRequest}s
 * on the root path
 *
 * @version 1.0.0
 * @since 1.0.0
 */
@WebServlet(
	description = "handles the HTTP request",
	urlPatterns = {
		"/*"
	}
)
public class MainServlet
extends BaseServlet {
	/**
	 * generated serial version unique identifier
	 *
	 * @since 1.0.0
	 */
	@Getter
	private static final long serialVersionUID = 1;

	@Override
	protected void doRequest(
		HttpServletRequest request,
		HttpServletResponse response
	)
	throws IOException {
		response.getWriter().println(App.helloWorld());
	}
}
